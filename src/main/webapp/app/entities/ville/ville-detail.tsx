import React, { useEffect } from 'react';
import { Link, useParams } from 'react-router-dom';
import { Button, Row, Col } from 'reactstrap';
import { Translate } from 'react-jhipster';
import { FontAwesomeIcon } from '@fortawesome/react-fontawesome';

import { useAppDispatch, useAppSelector } from 'app/config/store';

import { getEntity } from './ville.reducer';

export const VilleDetail = () => {
  const dispatch = useAppDispatch();

  const { id } = useParams<'id'>();

  useEffect(() => {
    dispatch(getEntity(id));
  }, []);

  const villeEntity = useAppSelector(state => state.ville.entity);
  return (
    <Row>
      <Col md="8">
        <h2 data-cy="villeDetailsHeading">
          <Translate contentKey="pharmaAiApp.ville.detail.title">Ville</Translate>
        </h2>
        <dl className="jh-entity-details">
          <dt>
            <span id="id">
              <Translate contentKey="global.field.id">ID</Translate>
            </span>
          </dt>
          <dd>{villeEntity.id}</dd>
          <dt>
            <span id="nom">
              <Translate contentKey="pharmaAiApp.ville.nom">Nom</Translate>
            </span>
          </dt>
          <dd>{villeEntity.nom}</dd>
          <dt>
            <span id="image">
              <Translate contentKey="pharmaAiApp.ville.image">Image</Translate>
            </span>
          </dt>
          {/*<dd>{villeEntity.image}</dd>*/}
          <img alt="villeImage" src={`data:image/png;base64,${villeEntity.image}`} style={{ maxHeight: '120px' }} />
        </dl>
        <Button tag={Link} to="/ville" replace color="info" data-cy="entityDetailsBackButton">
          <FontAwesomeIcon icon="arrow-left" />{' '}
          <span className="d-none d-md-inline">
            <Translate contentKey="entity.action.back">Back</Translate>
          </span>
        </Button>
        &nbsp;
        <Button tag={Link} to={`/ville/${villeEntity.id}/edit`} replace color="primary">
          <FontAwesomeIcon icon="pencil-alt" />{' '}
          <span className="d-none d-md-inline">
            <Translate contentKey="entity.action.edit">Edit</Translate>
          </span>
        </Button>
      </Col>
    </Row>
  );
};

export default VilleDetail;
