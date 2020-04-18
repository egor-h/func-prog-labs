module SpaceAge (Planet(..), ageOn) where

toYears :: Float -> Float -> Float
toYears seconds coeff = seconds /( 60 * 60 * 24 * 365.25 * coeff)

-- toDays :: Float -> Float -> Float
-- toDays seconds coeff = seconds /( 60 * 60 * 24 * coeff)

data Planet = Mercury
            | Venus
            | Earth
            | Mars
            | Jupiter
            | Saturn
            | Uranus
            | Neptune

ageOn :: Planet -> Float -> Float
ageOn Mercury seconds = toYears seconds 0.2408467
ageOn Venus   seconds = toYears seconds 0.61519726
ageOn Earth   seconds = toYears seconds 1.0
ageOn Mars    seconds = toYears seconds 1.8808158
ageOn Jupiter seconds = toYears seconds 11.862615
ageOn Saturn  seconds = toYears seconds 29.447498
ageOn Uranus  seconds = toYears seconds 84.016846
ageOn Neptune seconds = toYears seconds 164.79132
