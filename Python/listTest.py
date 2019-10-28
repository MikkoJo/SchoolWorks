def create_list():
    num = 0
    numbers = []

    while num != "Stop!":
        num = input("Give number: ")
        try:
           numbers.append(int(num))
        except ValueError:
            try:
                numbers.append(float(num))
            except ValueError:
                if num != "Stop!":
                    print("Not a valid number!")
    return numbers

def posite_values(numbers):
    pos_numbers = []
    for num in numbers:
        if num >= 0:
            pos_numbers.append(num)
    return pos_numbers


def main():
    numbers = create_list()
    print("Original list:\n", numbers)
    pos_numbers = posite_values(numbers)
    print("Only positive numbers:\n", pos_numbers)

if __name__ == "__main__": 
    main()
