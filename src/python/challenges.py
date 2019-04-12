from utils import *

logger = get_logger()


def multiplesof3and5(*args):
    logger.info('Starting challenge: Multiples of 3 and 5')
    limit = args[0][0]
    result = 0
    for i in range(1, limit):
        logger.debug(f'Checking if number {i} is multiple of 3 or 5')
        if is_multiple(i, 3) or is_multiple(i, 5):
            result += i
            logger.debug(f'Sum so far is: {result}')
    logger.info(f'{result} is the sum of all numbers under {limit} that are multiples of 3 or 5')


def evenfibonaccinumbers(*args):
    logger.info('Starting challenge: Even Fibonacci numbers')
    limit = args[0][0]
    result = 0
    fib = fibonacci_up_to(limit)
    for i in fib:
        if i % 2 == 0:
            result += i
    logger.info(f'The sum of the even Fibonacci numbers whose value are under {limit} is {result}')


def largestprimefactor(*args):
    logger.info('Starting challenge: Largest prime factor')
    limit = args[0][0]
    result = 2
    limit_aux = limit
    while limit_aux != 1:
        for i in range(2, int(limit_aux + 1)):
            if limit_aux % i == 0 and is_prime(i):
                logger.debug(f'{i} is a prime factor of {limit_aux}')
                limit_aux /= i
                result = i
                break
    logger.info(f'The largest prime factor of {limit} is {result}')


def largestpalindromeproduct(*args):
    logger.info('Starting challenge: Largest palindrome product')
    digits = args[0][0]
    result = 0
    limit = ''
    for i in range(digits):
        limit += '9'
    limit = int(limit)
    div_lower_limit = limit
    for i in range(digits - 1):
        div_lower_limit /= 10
    lower_limit = int(limit / div_lower_limit)
    for i in range(lower_limit, limit + 1):
        for j in range(i, limit + 1):
            product = i * j
            if i * j <= result:
                break
            if is_palindrome(product):
                logger.debug(f'{product} is palindrome and bigger than {result}')
                result = i * j
    logger.info(f'The largest palindrome product of 2 numbers of {digits} digits is {result}')

    

