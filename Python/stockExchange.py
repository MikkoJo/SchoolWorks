VALITYSPALKKIO = 25
KULUTKK = 0.1

def osakeKauppa():

    while True:
        try:
            osake_lkm = int(input("Kuinka monta yhtiön osaketta omistat?: "))
            osake_ostohinta = float(input("Mikä oli osakkeiden ostohinta per osake?: "))
            osake_myyntihinta = float(input("Mikä on osakkeiden myyntihinta per osake?: "))
            osake_omistusaika = int(input("Kuinka monta kuukautta olet omistanut osakkeet?: "))
            break
        except ValueError:
            print("Anna luku")

    kokonais_osto_tappio = osake_lkm * osake_ostohinta + VALITYSPALKKIO
    kulut = osake_omistusaika * KULUTKK * osake_lkm
    kokonais_myyntiarvo = osake_lkm * osake_myyntihinta - VALITYSPALKKIO
    tulos = kokonais_myyntiarvo - kokonais_osto_tappio - kulut
    return tulos

def main():
    tulos = osakeKauppa()
    print(f"Osakkeiden myynnitä syntyvä nettotulos: {tulos}")

if __name__ == "__main__":
    main()
