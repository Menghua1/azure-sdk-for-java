// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.machinelearning.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Settings used for training the model. For more information on the available settings please visit the official
 * documentation: https://docs.microsoft.com/en-us/azure/machine-learning/how-to-auto-train-image-models.
 */
@Fluent
public class ImageModelSettings {
    /*
     * Settings for advanced scenarios.
     */
    @JsonProperty(value = "advancedSettings")
    private String advancedSettings;

    /*
     * Enable AMSGrad when optimizer is 'adam' or 'adamw'.
     */
    @JsonProperty(value = "amsGradient")
    private Boolean amsGradient;

    /*
     * Settings for using Augmentations.
     */
    @JsonProperty(value = "augmentations")
    private String augmentations;

    /*
     * Value of 'beta1' when optimizer is 'adam' or 'adamw'. Must be a float in the range [0, 1].
     */
    @JsonProperty(value = "beta1")
    private Float beta1;

    /*
     * Value of 'beta2' when optimizer is 'adam' or 'adamw'. Must be a float in the range [0, 1].
     */
    @JsonProperty(value = "beta2")
    private Float beta2;

    /*
     * Frequency to store model checkpoints. Must be a positive integer.
     */
    @JsonProperty(value = "checkpointFrequency")
    private Integer checkpointFrequency;

    /*
     * The pretrained checkpoint model for incremental training.
     */
    @JsonProperty(value = "checkpointModel")
    private MLFlowModelJobInput checkpointModel;

    /*
     * The id of a previous run that has a pretrained checkpoint for incremental training.
     */
    @JsonProperty(value = "checkpointRunId")
    private String checkpointRunId;

    /*
     * Whether to use distributed training.
     */
    @JsonProperty(value = "distributed")
    private Boolean distributed;

    /*
     * Enable early stopping logic during training.
     */
    @JsonProperty(value = "earlyStopping")
    private Boolean earlyStopping;

    /*
     * Minimum number of epochs or validation evaluations to wait before primary metric improvement
     * is tracked for early stopping. Must be a positive integer.
     */
    @JsonProperty(value = "earlyStoppingDelay")
    private Integer earlyStoppingDelay;

    /*
     * Minimum number of epochs or validation evaluations with no primary metric improvement before
     * the run is stopped. Must be a positive integer.
     */
    @JsonProperty(value = "earlyStoppingPatience")
    private Integer earlyStoppingPatience;

    /*
     * Enable normalization when exporting ONNX model.
     */
    @JsonProperty(value = "enableOnnxNormalization")
    private Boolean enableOnnxNormalization;

    /*
     * Frequency to evaluate validation dataset to get metric scores. Must be a positive integer.
     */
    @JsonProperty(value = "evaluationFrequency")
    private Integer evaluationFrequency;

    /*
     * Gradient accumulation means running a configured number of "GradAccumulationStep"\  steps without
     * updating the model weights while accumulating the gradients of those steps, and then using
     * the accumulated gradients to compute the weight updates. Must be a positive integer.
     */
    @JsonProperty(value = "gradientAccumulationStep")
    private Integer gradientAccumulationStep;

    /*
     * Number of layers to freeze for the model. Must be a positive integer.
     * For instance, passing 2 as value for 'seresnext' means
     * freezing layer0 and layer1. For a full list of models supported and details on layer freeze, please
     * see: https://docs.microsoft.com/en-us/azure/machine-learning/how-to-auto-train-image-models.
     */
    @JsonProperty(value = "layersToFreeze")
    private Integer layersToFreeze;

    /*
     * Initial learning rate. Must be a float in the range [0, 1].
     */
    @JsonProperty(value = "learningRate")
    private Float learningRate;

    /*
     * Type of learning rate scheduler. Must be 'warmup_cosine' or 'step'.
     */
    @JsonProperty(value = "learningRateScheduler")
    private LearningRateScheduler learningRateScheduler;

    /*
     * Name of the model to use for training.
     * For more information on the available models please visit the official documentation:
     * https://docs.microsoft.com/en-us/azure/machine-learning/how-to-auto-train-image-models.
     */
    @JsonProperty(value = "modelName")
    private String modelName;

    /*
     * Value of momentum when optimizer is 'sgd'. Must be a float in the range [0, 1].
     */
    @JsonProperty(value = "momentum")
    private Float momentum;

    /*
     * Enable nesterov when optimizer is 'sgd'.
     */
    @JsonProperty(value = "nesterov")
    private Boolean nesterov;

    /*
     * Number of training epochs. Must be a positive integer.
     */
    @JsonProperty(value = "numberOfEpochs")
    private Integer numberOfEpochs;

    /*
     * Number of data loader workers. Must be a non-negative integer.
     */
    @JsonProperty(value = "numberOfWorkers")
    private Integer numberOfWorkers;

    /*
     * Type of optimizer.
     */
    @JsonProperty(value = "optimizer")
    private StochasticOptimizer optimizer;

    /*
     * Random seed to be used when using deterministic training.
     */
    @JsonProperty(value = "randomSeed")
    private Integer randomSeed;

    /*
     * Value of gamma when learning rate scheduler is 'step'. Must be a float in the range [0, 1].
     */
    @JsonProperty(value = "stepLRGamma")
    private Float stepLRGamma;

    /*
     * Value of step size when learning rate scheduler is 'step'. Must be a positive integer.
     */
    @JsonProperty(value = "stepLRStepSize")
    private Integer stepLRStepSize;

    /*
     * Training batch size. Must be a positive integer.
     */
    @JsonProperty(value = "trainingBatchSize")
    private Integer trainingBatchSize;

    /*
     * Validation batch size. Must be a positive integer.
     */
    @JsonProperty(value = "validationBatchSize")
    private Integer validationBatchSize;

    /*
     * Value of cosine cycle when learning rate scheduler is 'warmup_cosine'. Must be a float in the range [0, 1].
     */
    @JsonProperty(value = "warmupCosineLRCycles")
    private Float warmupCosineLRCycles;

    /*
     * Value of warmup epochs when learning rate scheduler is 'warmup_cosine'. Must be a positive integer.
     */
    @JsonProperty(value = "warmupCosineLRWarmupEpochs")
    private Integer warmupCosineLRWarmupEpochs;

    /*
     * Value of weight decay when optimizer is 'sgd', 'adam', or 'adamw'. Must be a float in the range[0, 1].
     */
    @JsonProperty(value = "weightDecay")
    private Float weightDecay;

    /** Creates an instance of ImageModelSettings class. */
    public ImageModelSettings() {
    }

    /**
     * Get the advancedSettings property: Settings for advanced scenarios.
     *
     * @return the advancedSettings value.
     */
    public String advancedSettings() {
        return this.advancedSettings;
    }

    /**
     * Set the advancedSettings property: Settings for advanced scenarios.
     *
     * @param advancedSettings the advancedSettings value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withAdvancedSettings(String advancedSettings) {
        this.advancedSettings = advancedSettings;
        return this;
    }

    /**
     * Get the amsGradient property: Enable AMSGrad when optimizer is 'adam' or 'adamw'.
     *
     * @return the amsGradient value.
     */
    public Boolean amsGradient() {
        return this.amsGradient;
    }

    /**
     * Set the amsGradient property: Enable AMSGrad when optimizer is 'adam' or 'adamw'.
     *
     * @param amsGradient the amsGradient value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withAmsGradient(Boolean amsGradient) {
        this.amsGradient = amsGradient;
        return this;
    }

    /**
     * Get the augmentations property: Settings for using Augmentations.
     *
     * @return the augmentations value.
     */
    public String augmentations() {
        return this.augmentations;
    }

    /**
     * Set the augmentations property: Settings for using Augmentations.
     *
     * @param augmentations the augmentations value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withAugmentations(String augmentations) {
        this.augmentations = augmentations;
        return this;
    }

    /**
     * Get the beta1 property: Value of 'beta1' when optimizer is 'adam' or 'adamw'. Must be a float in the range [0,
     * 1].
     *
     * @return the beta1 value.
     */
    public Float beta1() {
        return this.beta1;
    }

    /**
     * Set the beta1 property: Value of 'beta1' when optimizer is 'adam' or 'adamw'. Must be a float in the range [0,
     * 1].
     *
     * @param beta1 the beta1 value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withBeta1(Float beta1) {
        this.beta1 = beta1;
        return this;
    }

    /**
     * Get the beta2 property: Value of 'beta2' when optimizer is 'adam' or 'adamw'. Must be a float in the range [0,
     * 1].
     *
     * @return the beta2 value.
     */
    public Float beta2() {
        return this.beta2;
    }

    /**
     * Set the beta2 property: Value of 'beta2' when optimizer is 'adam' or 'adamw'. Must be a float in the range [0,
     * 1].
     *
     * @param beta2 the beta2 value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withBeta2(Float beta2) {
        this.beta2 = beta2;
        return this;
    }

    /**
     * Get the checkpointFrequency property: Frequency to store model checkpoints. Must be a positive integer.
     *
     * @return the checkpointFrequency value.
     */
    public Integer checkpointFrequency() {
        return this.checkpointFrequency;
    }

    /**
     * Set the checkpointFrequency property: Frequency to store model checkpoints. Must be a positive integer.
     *
     * @param checkpointFrequency the checkpointFrequency value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withCheckpointFrequency(Integer checkpointFrequency) {
        this.checkpointFrequency = checkpointFrequency;
        return this;
    }

    /**
     * Get the checkpointModel property: The pretrained checkpoint model for incremental training.
     *
     * @return the checkpointModel value.
     */
    public MLFlowModelJobInput checkpointModel() {
        return this.checkpointModel;
    }

    /**
     * Set the checkpointModel property: The pretrained checkpoint model for incremental training.
     *
     * @param checkpointModel the checkpointModel value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withCheckpointModel(MLFlowModelJobInput checkpointModel) {
        this.checkpointModel = checkpointModel;
        return this;
    }

    /**
     * Get the checkpointRunId property: The id of a previous run that has a pretrained checkpoint for incremental
     * training.
     *
     * @return the checkpointRunId value.
     */
    public String checkpointRunId() {
        return this.checkpointRunId;
    }

    /**
     * Set the checkpointRunId property: The id of a previous run that has a pretrained checkpoint for incremental
     * training.
     *
     * @param checkpointRunId the checkpointRunId value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withCheckpointRunId(String checkpointRunId) {
        this.checkpointRunId = checkpointRunId;
        return this;
    }

    /**
     * Get the distributed property: Whether to use distributed training.
     *
     * @return the distributed value.
     */
    public Boolean distributed() {
        return this.distributed;
    }

    /**
     * Set the distributed property: Whether to use distributed training.
     *
     * @param distributed the distributed value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withDistributed(Boolean distributed) {
        this.distributed = distributed;
        return this;
    }

    /**
     * Get the earlyStopping property: Enable early stopping logic during training.
     *
     * @return the earlyStopping value.
     */
    public Boolean earlyStopping() {
        return this.earlyStopping;
    }

    /**
     * Set the earlyStopping property: Enable early stopping logic during training.
     *
     * @param earlyStopping the earlyStopping value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withEarlyStopping(Boolean earlyStopping) {
        this.earlyStopping = earlyStopping;
        return this;
    }

    /**
     * Get the earlyStoppingDelay property: Minimum number of epochs or validation evaluations to wait before primary
     * metric improvement is tracked for early stopping. Must be a positive integer.
     *
     * @return the earlyStoppingDelay value.
     */
    public Integer earlyStoppingDelay() {
        return this.earlyStoppingDelay;
    }

    /**
     * Set the earlyStoppingDelay property: Minimum number of epochs or validation evaluations to wait before primary
     * metric improvement is tracked for early stopping. Must be a positive integer.
     *
     * @param earlyStoppingDelay the earlyStoppingDelay value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withEarlyStoppingDelay(Integer earlyStoppingDelay) {
        this.earlyStoppingDelay = earlyStoppingDelay;
        return this;
    }

    /**
     * Get the earlyStoppingPatience property: Minimum number of epochs or validation evaluations with no primary metric
     * improvement before the run is stopped. Must be a positive integer.
     *
     * @return the earlyStoppingPatience value.
     */
    public Integer earlyStoppingPatience() {
        return this.earlyStoppingPatience;
    }

    /**
     * Set the earlyStoppingPatience property: Minimum number of epochs or validation evaluations with no primary metric
     * improvement before the run is stopped. Must be a positive integer.
     *
     * @param earlyStoppingPatience the earlyStoppingPatience value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withEarlyStoppingPatience(Integer earlyStoppingPatience) {
        this.earlyStoppingPatience = earlyStoppingPatience;
        return this;
    }

    /**
     * Get the enableOnnxNormalization property: Enable normalization when exporting ONNX model.
     *
     * @return the enableOnnxNormalization value.
     */
    public Boolean enableOnnxNormalization() {
        return this.enableOnnxNormalization;
    }

    /**
     * Set the enableOnnxNormalization property: Enable normalization when exporting ONNX model.
     *
     * @param enableOnnxNormalization the enableOnnxNormalization value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withEnableOnnxNormalization(Boolean enableOnnxNormalization) {
        this.enableOnnxNormalization = enableOnnxNormalization;
        return this;
    }

    /**
     * Get the evaluationFrequency property: Frequency to evaluate validation dataset to get metric scores. Must be a
     * positive integer.
     *
     * @return the evaluationFrequency value.
     */
    public Integer evaluationFrequency() {
        return this.evaluationFrequency;
    }

    /**
     * Set the evaluationFrequency property: Frequency to evaluate validation dataset to get metric scores. Must be a
     * positive integer.
     *
     * @param evaluationFrequency the evaluationFrequency value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withEvaluationFrequency(Integer evaluationFrequency) {
        this.evaluationFrequency = evaluationFrequency;
        return this;
    }

    /**
     * Get the gradientAccumulationStep property: Gradient accumulation means running a configured number of
     * "GradAccumulationStep"\ steps without updating the model weights while accumulating the gradients of those steps,
     * and then using the accumulated gradients to compute the weight updates. Must be a positive integer.
     *
     * @return the gradientAccumulationStep value.
     */
    public Integer gradientAccumulationStep() {
        return this.gradientAccumulationStep;
    }

    /**
     * Set the gradientAccumulationStep property: Gradient accumulation means running a configured number of
     * "GradAccumulationStep"\ steps without updating the model weights while accumulating the gradients of those steps,
     * and then using the accumulated gradients to compute the weight updates. Must be a positive integer.
     *
     * @param gradientAccumulationStep the gradientAccumulationStep value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withGradientAccumulationStep(Integer gradientAccumulationStep) {
        this.gradientAccumulationStep = gradientAccumulationStep;
        return this;
    }

    /**
     * Get the layersToFreeze property: Number of layers to freeze for the model. Must be a positive integer. For
     * instance, passing 2 as value for 'seresnext' means freezing layer0 and layer1. For a full list of models
     * supported and details on layer freeze, please see:
     * https://docs.microsoft.com/en-us/azure/machine-learning/how-to-auto-train-image-models.
     *
     * @return the layersToFreeze value.
     */
    public Integer layersToFreeze() {
        return this.layersToFreeze;
    }

    /**
     * Set the layersToFreeze property: Number of layers to freeze for the model. Must be a positive integer. For
     * instance, passing 2 as value for 'seresnext' means freezing layer0 and layer1. For a full list of models
     * supported and details on layer freeze, please see:
     * https://docs.microsoft.com/en-us/azure/machine-learning/how-to-auto-train-image-models.
     *
     * @param layersToFreeze the layersToFreeze value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withLayersToFreeze(Integer layersToFreeze) {
        this.layersToFreeze = layersToFreeze;
        return this;
    }

    /**
     * Get the learningRate property: Initial learning rate. Must be a float in the range [0, 1].
     *
     * @return the learningRate value.
     */
    public Float learningRate() {
        return this.learningRate;
    }

    /**
     * Set the learningRate property: Initial learning rate. Must be a float in the range [0, 1].
     *
     * @param learningRate the learningRate value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withLearningRate(Float learningRate) {
        this.learningRate = learningRate;
        return this;
    }

    /**
     * Get the learningRateScheduler property: Type of learning rate scheduler. Must be 'warmup_cosine' or 'step'.
     *
     * @return the learningRateScheduler value.
     */
    public LearningRateScheduler learningRateScheduler() {
        return this.learningRateScheduler;
    }

    /**
     * Set the learningRateScheduler property: Type of learning rate scheduler. Must be 'warmup_cosine' or 'step'.
     *
     * @param learningRateScheduler the learningRateScheduler value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withLearningRateScheduler(LearningRateScheduler learningRateScheduler) {
        this.learningRateScheduler = learningRateScheduler;
        return this;
    }

    /**
     * Get the modelName property: Name of the model to use for training. For more information on the available models
     * please visit the official documentation:
     * https://docs.microsoft.com/en-us/azure/machine-learning/how-to-auto-train-image-models.
     *
     * @return the modelName value.
     */
    public String modelName() {
        return this.modelName;
    }

    /**
     * Set the modelName property: Name of the model to use for training. For more information on the available models
     * please visit the official documentation:
     * https://docs.microsoft.com/en-us/azure/machine-learning/how-to-auto-train-image-models.
     *
     * @param modelName the modelName value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }

    /**
     * Get the momentum property: Value of momentum when optimizer is 'sgd'. Must be a float in the range [0, 1].
     *
     * @return the momentum value.
     */
    public Float momentum() {
        return this.momentum;
    }

    /**
     * Set the momentum property: Value of momentum when optimizer is 'sgd'. Must be a float in the range [0, 1].
     *
     * @param momentum the momentum value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withMomentum(Float momentum) {
        this.momentum = momentum;
        return this;
    }

    /**
     * Get the nesterov property: Enable nesterov when optimizer is 'sgd'.
     *
     * @return the nesterov value.
     */
    public Boolean nesterov() {
        return this.nesterov;
    }

    /**
     * Set the nesterov property: Enable nesterov when optimizer is 'sgd'.
     *
     * @param nesterov the nesterov value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withNesterov(Boolean nesterov) {
        this.nesterov = nesterov;
        return this;
    }

    /**
     * Get the numberOfEpochs property: Number of training epochs. Must be a positive integer.
     *
     * @return the numberOfEpochs value.
     */
    public Integer numberOfEpochs() {
        return this.numberOfEpochs;
    }

    /**
     * Set the numberOfEpochs property: Number of training epochs. Must be a positive integer.
     *
     * @param numberOfEpochs the numberOfEpochs value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withNumberOfEpochs(Integer numberOfEpochs) {
        this.numberOfEpochs = numberOfEpochs;
        return this;
    }

    /**
     * Get the numberOfWorkers property: Number of data loader workers. Must be a non-negative integer.
     *
     * @return the numberOfWorkers value.
     */
    public Integer numberOfWorkers() {
        return this.numberOfWorkers;
    }

    /**
     * Set the numberOfWorkers property: Number of data loader workers. Must be a non-negative integer.
     *
     * @param numberOfWorkers the numberOfWorkers value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withNumberOfWorkers(Integer numberOfWorkers) {
        this.numberOfWorkers = numberOfWorkers;
        return this;
    }

    /**
     * Get the optimizer property: Type of optimizer.
     *
     * @return the optimizer value.
     */
    public StochasticOptimizer optimizer() {
        return this.optimizer;
    }

    /**
     * Set the optimizer property: Type of optimizer.
     *
     * @param optimizer the optimizer value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withOptimizer(StochasticOptimizer optimizer) {
        this.optimizer = optimizer;
        return this;
    }

    /**
     * Get the randomSeed property: Random seed to be used when using deterministic training.
     *
     * @return the randomSeed value.
     */
    public Integer randomSeed() {
        return this.randomSeed;
    }

    /**
     * Set the randomSeed property: Random seed to be used when using deterministic training.
     *
     * @param randomSeed the randomSeed value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withRandomSeed(Integer randomSeed) {
        this.randomSeed = randomSeed;
        return this;
    }

    /**
     * Get the stepLRGamma property: Value of gamma when learning rate scheduler is 'step'. Must be a float in the range
     * [0, 1].
     *
     * @return the stepLRGamma value.
     */
    public Float stepLRGamma() {
        return this.stepLRGamma;
    }

    /**
     * Set the stepLRGamma property: Value of gamma when learning rate scheduler is 'step'. Must be a float in the range
     * [0, 1].
     *
     * @param stepLRGamma the stepLRGamma value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withStepLRGamma(Float stepLRGamma) {
        this.stepLRGamma = stepLRGamma;
        return this;
    }

    /**
     * Get the stepLRStepSize property: Value of step size when learning rate scheduler is 'step'. Must be a positive
     * integer.
     *
     * @return the stepLRStepSize value.
     */
    public Integer stepLRStepSize() {
        return this.stepLRStepSize;
    }

    /**
     * Set the stepLRStepSize property: Value of step size when learning rate scheduler is 'step'. Must be a positive
     * integer.
     *
     * @param stepLRStepSize the stepLRStepSize value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withStepLRStepSize(Integer stepLRStepSize) {
        this.stepLRStepSize = stepLRStepSize;
        return this;
    }

    /**
     * Get the trainingBatchSize property: Training batch size. Must be a positive integer.
     *
     * @return the trainingBatchSize value.
     */
    public Integer trainingBatchSize() {
        return this.trainingBatchSize;
    }

    /**
     * Set the trainingBatchSize property: Training batch size. Must be a positive integer.
     *
     * @param trainingBatchSize the trainingBatchSize value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withTrainingBatchSize(Integer trainingBatchSize) {
        this.trainingBatchSize = trainingBatchSize;
        return this;
    }

    /**
     * Get the validationBatchSize property: Validation batch size. Must be a positive integer.
     *
     * @return the validationBatchSize value.
     */
    public Integer validationBatchSize() {
        return this.validationBatchSize;
    }

    /**
     * Set the validationBatchSize property: Validation batch size. Must be a positive integer.
     *
     * @param validationBatchSize the validationBatchSize value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withValidationBatchSize(Integer validationBatchSize) {
        this.validationBatchSize = validationBatchSize;
        return this;
    }

    /**
     * Get the warmupCosineLRCycles property: Value of cosine cycle when learning rate scheduler is 'warmup_cosine'.
     * Must be a float in the range [0, 1].
     *
     * @return the warmupCosineLRCycles value.
     */
    public Float warmupCosineLRCycles() {
        return this.warmupCosineLRCycles;
    }

    /**
     * Set the warmupCosineLRCycles property: Value of cosine cycle when learning rate scheduler is 'warmup_cosine'.
     * Must be a float in the range [0, 1].
     *
     * @param warmupCosineLRCycles the warmupCosineLRCycles value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withWarmupCosineLRCycles(Float warmupCosineLRCycles) {
        this.warmupCosineLRCycles = warmupCosineLRCycles;
        return this;
    }

    /**
     * Get the warmupCosineLRWarmupEpochs property: Value of warmup epochs when learning rate scheduler is
     * 'warmup_cosine'. Must be a positive integer.
     *
     * @return the warmupCosineLRWarmupEpochs value.
     */
    public Integer warmupCosineLRWarmupEpochs() {
        return this.warmupCosineLRWarmupEpochs;
    }

    /**
     * Set the warmupCosineLRWarmupEpochs property: Value of warmup epochs when learning rate scheduler is
     * 'warmup_cosine'. Must be a positive integer.
     *
     * @param warmupCosineLRWarmupEpochs the warmupCosineLRWarmupEpochs value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withWarmupCosineLRWarmupEpochs(Integer warmupCosineLRWarmupEpochs) {
        this.warmupCosineLRWarmupEpochs = warmupCosineLRWarmupEpochs;
        return this;
    }

    /**
     * Get the weightDecay property: Value of weight decay when optimizer is 'sgd', 'adam', or 'adamw'. Must be a float
     * in the range[0, 1].
     *
     * @return the weightDecay value.
     */
    public Float weightDecay() {
        return this.weightDecay;
    }

    /**
     * Set the weightDecay property: Value of weight decay when optimizer is 'sgd', 'adam', or 'adamw'. Must be a float
     * in the range[0, 1].
     *
     * @param weightDecay the weightDecay value to set.
     * @return the ImageModelSettings object itself.
     */
    public ImageModelSettings withWeightDecay(Float weightDecay) {
        this.weightDecay = weightDecay;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (checkpointModel() != null) {
            checkpointModel().validate();
        }
    }
}
