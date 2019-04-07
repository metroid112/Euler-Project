import utils
import challenges


def main():
    logger = utils.get_logger()
    utils.clear_log()
    logger.info('Starting the program...')
    utils.time_function(challenges.multiplesof3and5, 1000)


if __name__ == '__main__':
    main()
