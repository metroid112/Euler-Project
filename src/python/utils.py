import logging
import datetime
import timeit
import math

now = datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')
logging.basicConfig(
    filename='execution.log',
    format='{0} %(levelname)s:\t%(message)s'.format(now),
    level=logging.INFO
)
LOGGER = logging.getLogger('log')
separator = '******************************************************************************************'


def clear_log():
    with open('execution.log', 'w'):
        pass


def get_logger():
    return LOGGER


def time_function(function, *args):
    setup = 'from '
    setup += 'main ' if function.__name__ == 'main' else 'challenges '
    setup += f'import {function.__name__}'
    time = timeit.timeit(
        f'{function.__name__}({args})',
        setup=setup,
        number=1
    )
    LOGGER.info(f'{function.__name__} took {time} seconds')
    LOGGER.info(separator)


def print_matrix(series, cols):
    str_matrix = ''
    text = ''
    for i in range(1, len(series) + 1):
        text += series[i-1] + ' '
        if i % cols == 0:
            text += '\n'
            str_matrix += text
            text = ''
    return str_matrix


def is_multiple(number, multiple):
    mod = number % multiple
    LOGGER.debug('\tIs {0} multiple of {1}: {2}'.format(number, multiple, mod == 0))
    return mod == 0


def multiply_up_to(number):
    result = 1
    for i in range(1, number + 1):
        result *= i
    return result


def gcd(a, b):
    LOGGER.debug(f'\tGreatest common divisor between {a} and {b}')
    while b != 0:
        temp = b
        b = a % b
        a = temp
    LOGGER.debug(f'\tGCD is {a}')
    return a


def gcd_recursive(a, b):
    if b == 0:
        return a
    else:
        return gcd_recursive(b, a & b)


def gcd_between(numbers):
    result = numbers[0]
    for i in range(1, len(numbers)):
        result = gcd(result, numbers[i])
    LOGGER.debug(f'\tGCD between {numbers} is {result}')
    return result


def lcm(a, b):
    LOGGER.debug(f'\tLeast common multiple between {a} and {b} is {abs(a * b) / gcd(a, b)}')
    return abs(a * b) / gcd(a, b)


def lcm_recursive(a, b):
    return abs(a * b) / gcd_recursive(a, b)


def lcm_between(numbers):
    result = numbers[0]
    for i in range(1, len(numbers)):
        result = lcm(result, numbers[i])
    LOGGER.debug(f'\tLCM between {numbers} is {result}')
    return result


def sum_squares(numbers):
    result = 0
    for i in numbers:
        result += i * i
    LOGGER.debug(f'\tSum of the squares of {list(numbers)} is {result}')
    return result


def squared_sum(numbers):
    result = 0
    for i in numbers:
        result += i
    LOGGER.debug(f'\tSquared sum of {list(numbers)} is {result * result}')
    return result * result


def is_pythagorean_triplet(a, b, c):
    return a**2 + b**2 == c**2


def fibonacci_up_to(limit):
    LOGGER.debug('Fibonacci up to {0}'.format(limit))
    fib_1 = 1
    fib_2 = 1
    fib_sum = []
    while fib_2 < limit:
        LOGGER.debug('\t{0} + {1} = {2} {3}'.format(fib_1, fib_2, fib_1 + fib_2, fib_sum))
        fib_sum.append(fib_1 + fib_2)
        fib_1 = fib_2
        fib_2 = fib_sum[-1]
    return fib_sum


def primes_up_to(limit):
    LOGGER.debug('Primes up to {0}'.format(limit))
    primes_boolean = []
    primes = []
    for i in range(limit + 1):
        primes_boolean.append(True)
    for i in range(2, math.floor(math.sqrt(limit))):
        if primes_boolean[i]:
            for j in range(i * i, limit + 1, i):
                primes_boolean[j] = False
                LOGGER.debug('{} is not a prime'.format(j))
    for i in range(2, len(primes_boolean)):
        if primes_boolean[i]:
            primes.append(i)
    LOGGER.debug('Primes: {}'.format(primes))
    return primes


def nth_primes(limit):
    LOGGER.debug(f'\tCalculating the first {limit} primes')
    number = 3
    i = 1
    primes = [2]
    while i < limit:
        if is_prime(number):
            primes.append(number)
            i += 1
        number += 2
    LOGGER.debug(f'\tPrimes: {primes}')
    return primes


def is_prime(number):
    LOGGER.debug(f'\tChecking if {number} is a prime')
    if number <= 3:
        LOGGER.debug(f'\t{number} is ' + 'not' if number <= 1 else '' + ' a prime')
        return number > 1
    if number % 2 == 0 or number % 3 == 0:
        LOGGER.debug(f'\t{number} is not a prime')
        return False
    factor = 5
    while math.pow(factor, 2) <= number:
        if number % factor == 0 or number % (factor + 2) == 0:
            LOGGER.debug(f'\t{number} is not a prime')
            return False
        factor += 6
    LOGGER.debug(f'\t{number} is a prime')
    return True


def is_palindrome(number):
    LOGGER.debug(f'\tChecking if {number} is palindrome')
    str_number = str(number)
    for i in range(len(str_number)):
        if not str_number[i] == str_number[-i - 1]:
            LOGGER.debug(f'\t{number} is not a palindrome')
            return False
    LOGGER.debug(f'\t{number} is a palindrome')
    return True


def prime_factorization(number):
    LOGGER.debug(f'\tCalculating prime factorization of {number}')
    prime_factors = []
    while number % 2 == 0:
        LOGGER.debug(f'\t{2} is a prime factor')
        prime_factors.append(2)
        number /= 2
    factor = 3
    while factor * factor <= number:
        if number % factor == 0:
            LOGGER.debug(f'\t{factor} is a prime factor')
            prime_factors.append(factor)
            number /= factor
        else:
            factor += 2
    if number != 1:
        LOGGER.debug(f'\t{int(number)} is a prime factor')
        prime_factors.append(int(number))
    LOGGER.debug(f'\tPrime factors: {prime_factors}')
    return prime_factors

