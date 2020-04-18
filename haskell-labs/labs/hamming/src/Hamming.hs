{-# LANGUAGE MultiWayIf #-}
module Hamming (distance) where

findDistance :: String -> String -> Int
findDistance (x:xs) (y:ys) = if | x /= y    -> 1 + (findDistance xs ys)
                                | otherwise -> 0 + (findDistance xs ys)
findDistance [] [] = 0

distance :: String -> String -> Maybe Int
distance xs ys = if | (length xs) /= (length ys) -> Nothing
                    | otherwise -> Just (findDistance xs ys)
