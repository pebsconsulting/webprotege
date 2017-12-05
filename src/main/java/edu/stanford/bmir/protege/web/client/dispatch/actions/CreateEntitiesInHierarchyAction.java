package edu.stanford.bmir.protege.web.client.dispatch.actions;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableSet;
import edu.stanford.bmir.protege.web.shared.annotations.GwtSerializationConstructor;
import edu.stanford.bmir.protege.web.shared.project.ProjectId;
import org.semanticweb.owlapi.model.OWLEntity;

import javax.annotation.Nonnull;
import java.util.Optional;

/**
 * Author: Matthew Horridge<br>
 * Stanford University<br>
 * Bio-Medical Informatics Research Group<br>
 * Date: 25/03/2013
 */
public abstract class CreateEntitiesInHierarchyAction<R extends CreateEntitiesInHierarchyResult<E>, E extends OWLEntity> extends AbstractCreateEntitiesAction<R, E> {

    private E parent;

    @GwtSerializationConstructor
    protected CreateEntitiesInHierarchyAction() {
    }

    public CreateEntitiesInHierarchyAction(@Nonnull ProjectId projectId,
                                           @Nonnull ImmutableSet<String> browserTexts,
                                           @Nonnull Optional<E> parent) {
        super(projectId, browserTexts);
        this.parent = parent.orElse(null);
    }

    @Nonnull
    public Optional<E> getParent() {
        return Optional.ofNullable(parent);
    }
}
