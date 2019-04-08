from utils import *

logger = get_logger()


def multiplesof3and5(*args):
    logger.info('Starting challenge: Multiples of 3 and 5')
    limit = args[0][0]
    result = 0
    for i in range(1, limit):
        logger.debug('Checking if number {0} is multiple of 3 or 5'.format(i))
        if is_multiple(i, 3) or is_multiple(i, 5):
            result += i
            logger.debug('Sum so far is: {1}'.format(i, result))
    logger.info('{0} is the sum of all numbers under {1} that are multiples of 3 or 5'.format(result, limit))


def evenfibonaccinumbers(*args):
    logger.info('Starting challenge: Even Fibonacci numbers')
    limit = args[0][0]
    result = 0
    fib = fibonacci_up_to(limit)
    for i in fib:
        if i % 2 == 0:
            result += i
    logger.info('The sum of the even Fibonacci numbers whose value are under {0} is {1}'.format(limit, result))


def largestprimefactor(*args):
    logger.info('Starting challenge: Even Fibonacci numbers')
    limit = args[0][0]
    result = 0
    

