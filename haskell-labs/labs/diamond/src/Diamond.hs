module Diamond (diamond) where

import Data.Char;


charWithIdent :: Char -> String
charWithIdent c = let charNum = ord c
                  in 

diamond :: Char -> Maybe [String]
diamond c = if | c < 'A' -> Nothing
               | otherwise -> diamond c
               | (charWithIdent c) : diamond 
            where
                lowerChar c = chr ((ord c) - 1)
