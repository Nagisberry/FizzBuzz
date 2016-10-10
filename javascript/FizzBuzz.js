function fizzBuzz(end) {
    for (var i = 1; i <= end; i++) {
        console.info(new Array(Number(i % 3 === 0) + 1).join("Fizz") + new Array(Number(i % 5 === 0) + 1).join("Buzz") || i);
    }
}

fizzBuzz(100)