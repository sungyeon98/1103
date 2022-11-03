package kr.inhatc.spring.test.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QTest is a Querydsl query type for Test
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QTest extends EntityPathBase<Test> {

    private static final long serialVersionUID = 1906531464L;

    public static final QTest test = new QTest("test");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> myAge = createNumber("myAge", Integer.class);

    public final StringPath myInfo = createString("myInfo");

    public final StringPath myName = createString("myName");

    public QTest(String variable) {
        super(Test.class, forVariable(variable));
    }

    public QTest(Path<? extends Test> path) {
        super(path.getType(), path.getMetadata());
    }

    public QTest(PathMetadata metadata) {
        super(Test.class, metadata);
    }

}

