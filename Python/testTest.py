import unittest

def add(x,y):
    return x+y

class MyTest(unittest.TestCase):
    def test(self):
        self.assertEquals(add(2,3), 5)

if __name__ == "__main__":
    unittest.main()
