def to_fahremheit(temperature):
    return temperature * 1.8 + 32

def to_celcius(temperature):
    return (temperature - 32) / 1.8

def main():
    choice = input("Do you want to convert Celcius to Fahrenheit (F) or Fahrenheit to Celcius (C)?:")
    temperature = float(input("Give amount of degrees to convert: "))
    if choice == "F".lower():
        convertedTemp = to_fahremheit(temperature)
        print(f"{temperature} Celsius is {convertedTemp} Fahrenheits")
    elif choice == "C".lower():
        convertedTemp = to_celcius(temperature)
        print(f"{temperature} Fahrenheits is {convertedTemp} Celsius")
    print("Invalid choice!!!!!!!!1")

if __name__ == "__main__":
    main()
