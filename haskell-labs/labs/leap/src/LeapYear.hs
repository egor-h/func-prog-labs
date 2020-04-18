module LeapYear (isLeapYear) where

isLeapYear :: Integer -> Bool
isLeapYear year = divisibleBy400 || (divisibleBy4 && notDivisibleBy100)
                  where
                    notDivisibleBy100 = year `mod` 100 /= 0
                    divisibleBy400 = year `mod` 400 == 0
                    divisibleBy4   = year `mod` 4 == 0