defmodule Fizzbuzz do
  @moduledoc """
  Documentation for Fizzbuzz.
  """

  @doc """
    convert a number into a fizzBuzz
  """
  def of(number) do
    cond do
      Integer.mod(number, 3) == 0 -> :fizz
      Integer.mod(number, 5) == 0 -> :buzz
      true -> number
    end
  end

end
