defmodule FizzBuzz do
  def fizzbuzz(last) do
     Stream.iterate(1, &(&1 + 1))
     |> Stream.map(fn i when rem(i, 15) == 0 -> :FizzBuzz
                      i when rem(i,  3) == 0 -> :Fizz
                      i when rem(i,  5) == 0 -> :Buzz
                      i -> i end)
     |> Enum.take(last)
     |> Enum.each(&IO.puts/1)
  end
end

FizzBuzz.fizzbuzz(100)
