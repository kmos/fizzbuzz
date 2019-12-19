defmodule FizzbuzzTest do
  use ExUnit.Case
  doctest Fizzbuzz

  test "given one should I receive one" do
    assert Fizzbuzz.of(1) == 1
  end

  test "given two should I receive two" do
    assert Fizzbuzz.of(2) == 2
  end

  test "given three should I receive fizz" do
    assert Fizzbuzz.of(3) == :fizz
  end

  test "given five should I receive buzz" do
    assert Fizzbuzz.of(5) == :buzz
  end

  test "given 10 should I receive buzz" do
    assert Fizzbuzz.of(10) == :buzz
  end

  test "given 6 should I receive fizz" do
    assert Fizzbuzz.of(6) == :fizz
  end
end
