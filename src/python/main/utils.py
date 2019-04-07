import logging
import datetime


def setup():
    now = datetime.now()
    logging.basicConfig(
        filename='execution.log',
        format='%(now)s %(levelname)s:\t%(message)s',
        level=logging.DEBUG
    )