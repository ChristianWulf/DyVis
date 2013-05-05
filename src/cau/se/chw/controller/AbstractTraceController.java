package cau.se.chw.controller;

import prototypes.observer.AbstractObservable;
import prototypes.observer.IRegisterableObserver;

public abstract class AbstractTraceController extends AbstractObservable implements
		ITraceController, IRegisterableObserver {

}
