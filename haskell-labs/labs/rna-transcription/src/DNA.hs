{-# LANGUAGE MultiWayIf #-}

module DNA (toRNA) where



validDNApart :: Char -> Bool
validDNApart c = c `elem` "GCTA" 

dNAtoRNA :: Char -> Char
dNAtoRNA 'G' = 'C'
dNAtoRNA 'C' = 'G'
dNAtoRNA 'T' = 'A'
dNAtoRNA 'A' = 'U'
dNAtoRNA  c  =  c

toRNA :: String -> Either Char String
toRNA (s:xs) = if | validDNApart s -> fmap (\x -> (dNAtoRNA s) : x) (toRNA xs)
                  | otherwise      -> Left s 
toRNA "" = Right ""
