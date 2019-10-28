import unittest
import CelsiumFahrenhet

class TemperatureTest(unittest.TestCase):
    def test_toFahrenheit(self):
        fahr = CelsiumFahrenhet.to_fahremheit(25)
        self.assertEqual(fahr, 77)

    def test_toCelsius(self):
        cels = CelsiumFahrenhet.to_celcius(9)
        # self.assertEquals(cels, -12.77)
        self.assertAlmostEqual(cels, -12.777777777777777)

if __name__ == "__main__":
    unittest.main()
