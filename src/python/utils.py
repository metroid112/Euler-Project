import logging
import datetime
import timeit
import math

now = datetime.datetime.now().strftime('%Y-%m-%d %H:%M:%S')
logging.basicConfig(
    filename='execution.log',
    format='{0} %(levelname)s:\t%(message)s'.format(now),
    level=logging.DEBUG
)
LOGGER = logging.getLogger('log')
separator = '******************************************************************************************'


def clear_log():
    with open('execution.log', 'w'):
        pass


def get_logger():
    return LOGGER


def time_function(function, *args):
    time = timeit.timeit(
        '{0}({1})'.format(function.__name__, args),
        setup='from challenges import {0}'.format(function.__name__),
        number=1
    )
    LOGGER.info('{0} took {1} seconds'.format(function.__name__, time))
    LOGGER.info(separator)


def is_multiple(number, multiple):
    mod = number % multiple
    LOGGER.debug('\tIs {0} multiple of {1}: {2}'.format(number, multiple, mod == 0))
    return mod == 0


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
            i_squared = int(math.pow(i, 2))
            for j in range(i_squared, limit + 1, i):
                primes_boolean[j] = False
                LOGGER.debug('{} is not a prime'.format(j))
    for i in range(2, len(primes_boolean)):
        if primes_boolean[i]:
            primes.append(i)
    LOGGER.debug('Primes: {}'.format(primes))
    return primes


def is_prime(number):
    LOGGER.debug('Checking if {0} is a prime'.format(number))
    if number <= 3:
        return number > 1
    if number % 2 == 0 or number % 3 == 0:
        return False
    factor = 5
    while math.pow(factor, 2) <= number:
        if number % factor == 0 or number % (factor + 2) == 0:
            return False
        factor += 6
    return True

