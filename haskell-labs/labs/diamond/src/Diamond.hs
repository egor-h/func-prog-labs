module Diamond (diamond) where

import Data.Char;

-- getSpaces :: Int -> String
-- getSpaces 0 = ""
-- getSpaces 1 = " "
-- getSpaces n = " " : getSpaces (n - 1)

-- charWithIdent :: Char -> String
-- charWithIdent c width = let charNum = (ord c) - (ord base)
--                             base = 'A'
--                         in 

-- diamond :: Char -> Maybe [String]
-- diamond c = if | c < 'A' -> Nothing
--                | otherwise -> diamond c
--                | (charWithIdent c) : diamond 
--             where
--                 lowerChar c = chr ((ord c) - 1)
