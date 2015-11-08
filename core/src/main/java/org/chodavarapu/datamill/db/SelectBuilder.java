package org.chodavarapu.datamill.db;

import rx.Observable;

/**
 * @author Ravi Chodavarapu (rchodava@gmail.com)
 */
public interface SelectBuilder {
    WhereBuilder<Observable<Row>> from(String table);
}
