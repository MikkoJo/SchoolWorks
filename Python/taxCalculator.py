rajat = ((0, 10), (15000, 20), (30000, 30), (45000, 40), (60000, 50))

def laskeVero(tulo, prosentti):
    """Laskee veron määrän euroina
    
    Arguments:
        tulo {[float]} -- Tulo josta vero lasketaan
        prosentti {[float]} -- Veroprosentti
    
    Returns:
        [float] -- Veron määrä euroina
    """
    return float((tulo*prosentti)/100)

def laskeVerot(tulot):
    """Laskee progressiivisen veron määrän annetulla tulolla
       Progressioaste on rajat-muuttujassa 
    
    Arguments:
        tulot {[float]} -- Tulot josta vero lasketaan
    
    Returns:
        [float] -- Kokonaisveron määrä euroina
    """
    verot = 0
    for raja in reversed(rajat):
        temp = tulot - raja[0]
        if temp > 0:
            verot += laskeVero(temp, raja[1])
            tulot = tulot - temp
    return verot

def laskeKokonaisVeroProsentti(tulot, verot):
    """Laskee kokonaisveroprosentin
    
    Arguments:
        tulot {[float]} -- Tulot joista veron määrä lasketaan
        verot {[float]} -- Tuloista maksetut verot
    
    Returns:
        [float] -- Kokonaisveroprosentti
    """
    return (verot/tulot) * 100

def main():
    """Pääohjelma
    """
    while True:
        try:
            tulot = float(input("Anna vuositulosi: "))
            break
        except ValueError:
            print("Anna tulosi lukuna")

    verot = laskeVerot(tulot)
    kokonaisVeroProsentti = laskeKokonaisVeroProsentti(tulot, verot)
    print(f"Maksat veroja yhteensä {round(verot, 2)} euroa.")
    print(f"Veroprosenttisi on: {round(kokonaisVeroProsentti, 2)} %")

if __name__ == "__main__":
    main()
