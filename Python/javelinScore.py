import statistics
NUMBER_OF_THROWS = 6

def calculateAverage(distances):
    # return sum(distances)/len(distances)
    return statistics.mean(distances)

def printScores(distances):
    succesfull = len(distances)
    failed = NUMBER_OF_THROWS - succesfull
    average = calculateAverage(distances)
    print(f"Onnistuneita heittoja oli {succesfull} kpl.")
    print(f"Hylättyjä heittoja oli {failed} kpl.")
    print(f"Pisin heitto oli {max(distances)} metriä.")
    print(f"Heittojen keskiarvo oli {round(average, 2)} metriä.")

def main():
    distances = []
    index = NUMBER_OF_THROWS
    while index >= 0:
        try:
            distance = float(input("Anna viimeisimmän heiton pituus metreinä: "))
            if distance >= 0:
                distances.append(distance)
            index -= 1
        except ValueError:
            print("Not a number")

    printScores(distances)

if __name__ == "__main__":
    main()