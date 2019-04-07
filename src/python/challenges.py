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
            logger.info('{0} is a multiple of 3 or 5. Sum so far is: {1}'.format(i, result))
