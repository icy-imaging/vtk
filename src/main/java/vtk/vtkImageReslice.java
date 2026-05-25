// java wrapper for vtkImageReslice object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageReslice extends vtkThreadedImageAlgorithm
{

  private native int IsTypeOf_0(byte[] id0, int len0);
  public int IsTypeOf(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsTypeOf_0(bytes0, bytes0.length);
  }

  private native int IsA_1(byte[] id0, int len0);
  public int IsA(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return IsA_1(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBaseType_2(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBaseType(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBaseType_2(bytes0, bytes0.length);
  }

  private native long GetNumberOfGenerationsFromBase_3(byte[] id0, int len0);
  public long GetNumberOfGenerationsFromBase(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return GetNumberOfGenerationsFromBase_3(bytes0, bytes0.length);
  }

  private native void SetResliceAxes_4(vtkMatrix4x4 id0);
  public void SetResliceAxes(vtkMatrix4x4 id0)
  {
    SetResliceAxes_4(id0);
  }

  private native long GetResliceAxes_5();
  public vtkMatrix4x4 GetResliceAxes()
  {
    long temp = GetResliceAxes_5();

    if (temp == 0) return null;
    return (vtkMatrix4x4)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetResliceAxesDirectionCosines_6(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8);
  public void SetResliceAxesDirectionCosines(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8)
  {
    SetResliceAxesDirectionCosines_6(id0,id1,id2,id3,id4,id5,id6,id7,id8);
  }

  private native void SetResliceAxesDirectionCosines_7(double id0[],double id1[],double id2[]);
  public void SetResliceAxesDirectionCosines(double id0[],double id1[],double id2[])
  {
    SetResliceAxesDirectionCosines_7(id0,id1,id2);
  }

  private native void SetResliceAxesDirectionCosines_8(double id0[]);
  public void SetResliceAxesDirectionCosines(double id0[])
  {
    SetResliceAxesDirectionCosines_8(id0);
  }

  private native void GetResliceAxesDirectionCosines_9(double id0[],double id1[],double id2[]);
  public void GetResliceAxesDirectionCosines(double id0[],double id1[],double id2[])
  {
    GetResliceAxesDirectionCosines_9(id0,id1,id2);
  }

  private native void GetResliceAxesDirectionCosines_10(double id0[]);
  public void GetResliceAxesDirectionCosines(double id0[])
  {
    GetResliceAxesDirectionCosines_10(id0);
  }

  private native double[] GetResliceAxesDirectionCosines_11();
  public double[] GetResliceAxesDirectionCosines()
  {
    return GetResliceAxesDirectionCosines_11();
  }

  private native void SetResliceAxesOrigin_12(double id0,double id1,double id2);
  public void SetResliceAxesOrigin(double id0,double id1,double id2)
  {
    SetResliceAxesOrigin_12(id0,id1,id2);
  }

  private native void SetResliceAxesOrigin_13(double id0[]);
  public void SetResliceAxesOrigin(double id0[])
  {
    SetResliceAxesOrigin_13(id0);
  }

  private native void GetResliceAxesOrigin_14(double id0[]);
  public void GetResliceAxesOrigin(double id0[])
  {
    GetResliceAxesOrigin_14(id0);
  }

  private native double[] GetResliceAxesOrigin_15();
  public double[] GetResliceAxesOrigin()
  {
    return GetResliceAxesOrigin_15();
  }

  private native void SetResliceTransform_16(vtkAbstractTransform id0);
  public void SetResliceTransform(vtkAbstractTransform id0)
  {
    SetResliceTransform_16(id0);
  }

  private native long GetResliceTransform_17();
  public vtkAbstractTransform GetResliceTransform()
  {
    long temp = GetResliceTransform_17();

    if (temp == 0) return null;
    return (vtkAbstractTransform)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInformationInput_18(vtkImageData id0);
  public void SetInformationInput(vtkImageData id0)
  {
    SetInformationInput_18(id0);
  }

  private native long GetInformationInput_19();
  public vtkImageData GetInformationInput()
  {
    long temp = GetInformationInput_19();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTransformInputSampling_20(int id0);
  public void SetTransformInputSampling(int id0)
  {
    SetTransformInputSampling_20(id0);
  }

  private native void TransformInputSamplingOn_21();
  public void TransformInputSamplingOn()
  {
    TransformInputSamplingOn_21();
  }

  private native void TransformInputSamplingOff_22();
  public void TransformInputSamplingOff()
  {
    TransformInputSamplingOff_22();
  }

  private native int GetTransformInputSampling_23();
  public int GetTransformInputSampling()
  {
    return GetTransformInputSampling_23();
  }

  private native void SetAutoCropOutput_24(int id0);
  public void SetAutoCropOutput(int id0)
  {
    SetAutoCropOutput_24(id0);
  }

  private native void AutoCropOutputOn_25();
  public void AutoCropOutputOn()
  {
    AutoCropOutputOn_25();
  }

  private native void AutoCropOutputOff_26();
  public void AutoCropOutputOff()
  {
    AutoCropOutputOff_26();
  }

  private native int GetAutoCropOutput_27();
  public int GetAutoCropOutput()
  {
    return GetAutoCropOutput_27();
  }

  private native void SetWrap_28(int id0);
  public void SetWrap(int id0)
  {
    SetWrap_28(id0);
  }

  private native int GetWrap_29();
  public int GetWrap()
  {
    return GetWrap_29();
  }

  private native void WrapOn_30();
  public void WrapOn()
  {
    WrapOn_30();
  }

  private native void WrapOff_31();
  public void WrapOff()
  {
    WrapOff_31();
  }

  private native void SetMirror_32(int id0);
  public void SetMirror(int id0)
  {
    SetMirror_32(id0);
  }

  private native int GetMirror_33();
  public int GetMirror()
  {
    return GetMirror_33();
  }

  private native void MirrorOn_34();
  public void MirrorOn()
  {
    MirrorOn_34();
  }

  private native void MirrorOff_35();
  public void MirrorOff()
  {
    MirrorOff_35();
  }

  private native void SetBorder_36(int id0);
  public void SetBorder(int id0)
  {
    SetBorder_36(id0);
  }

  private native int GetBorder_37();
  public int GetBorder()
  {
    return GetBorder_37();
  }

  private native void BorderOn_38();
  public void BorderOn()
  {
    BorderOn_38();
  }

  private native void BorderOff_39();
  public void BorderOff()
  {
    BorderOff_39();
  }

  private native void SetBorderThickness_40(double id0);
  public void SetBorderThickness(double id0)
  {
    SetBorderThickness_40(id0);
  }

  private native double GetBorderThickness_41();
  public double GetBorderThickness()
  {
    return GetBorderThickness_41();
  }

  private native void SetInterpolationMode_42(int id0);
  public void SetInterpolationMode(int id0)
  {
    SetInterpolationMode_42(id0);
  }

  private native int GetInterpolationModeMinValue_43();
  public int GetInterpolationModeMinValue()
  {
    return GetInterpolationModeMinValue_43();
  }

  private native int GetInterpolationModeMaxValue_44();
  public int GetInterpolationModeMaxValue()
  {
    return GetInterpolationModeMaxValue_44();
  }

  private native int GetInterpolationMode_45();
  public int GetInterpolationMode()
  {
    return GetInterpolationMode_45();
  }

  private native void SetInterpolationModeToNearestNeighbor_46();
  public void SetInterpolationModeToNearestNeighbor()
  {
    SetInterpolationModeToNearestNeighbor_46();
  }

  private native void SetInterpolationModeToLinear_47();
  public void SetInterpolationModeToLinear()
  {
    SetInterpolationModeToLinear_47();
  }

  private native void SetInterpolationModeToCubic_48();
  public void SetInterpolationModeToCubic()
  {
    SetInterpolationModeToCubic_48();
  }

  private native byte[] GetInterpolationModeAsString_49();
  public String GetInterpolationModeAsString()
  {
    return new String(GetInterpolationModeAsString_49(), StandardCharsets.UTF_8);
  }

  private native void SetInterpolator_50(vtkAbstractImageInterpolator id0);
  public void SetInterpolator(vtkAbstractImageInterpolator id0)
  {
    SetInterpolator_50(id0);
  }

  private native long GetInterpolator_51();
  public vtkAbstractImageInterpolator GetInterpolator()
  {
    long temp = GetInterpolator_51();

    if (temp == 0) return null;
    return (vtkAbstractImageInterpolator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSlabMode_52(int id0);
  public void SetSlabMode(int id0)
  {
    SetSlabMode_52(id0);
  }

  private native int GetSlabModeMinValue_53();
  public int GetSlabModeMinValue()
  {
    return GetSlabModeMinValue_53();
  }

  private native int GetSlabModeMaxValue_54();
  public int GetSlabModeMaxValue()
  {
    return GetSlabModeMaxValue_54();
  }

  private native int GetSlabMode_55();
  public int GetSlabMode()
  {
    return GetSlabMode_55();
  }

  private native void SetSlabModeToMin_56();
  public void SetSlabModeToMin()
  {
    SetSlabModeToMin_56();
  }

  private native void SetSlabModeToMax_57();
  public void SetSlabModeToMax()
  {
    SetSlabModeToMax_57();
  }

  private native void SetSlabModeToMean_58();
  public void SetSlabModeToMean()
  {
    SetSlabModeToMean_58();
  }

  private native void SetSlabModeToSum_59();
  public void SetSlabModeToSum()
  {
    SetSlabModeToSum_59();
  }

  private native byte[] GetSlabModeAsString_60();
  public String GetSlabModeAsString()
  {
    return new String(GetSlabModeAsString_60(), StandardCharsets.UTF_8);
  }

  private native void SetSlabNumberOfSlices_61(int id0);
  public void SetSlabNumberOfSlices(int id0)
  {
    SetSlabNumberOfSlices_61(id0);
  }

  private native int GetSlabNumberOfSlices_62();
  public int GetSlabNumberOfSlices()
  {
    return GetSlabNumberOfSlices_62();
  }

  private native void SetSlabTrapezoidIntegration_63(int id0);
  public void SetSlabTrapezoidIntegration(int id0)
  {
    SetSlabTrapezoidIntegration_63(id0);
  }

  private native void SlabTrapezoidIntegrationOn_64();
  public void SlabTrapezoidIntegrationOn()
  {
    SlabTrapezoidIntegrationOn_64();
  }

  private native void SlabTrapezoidIntegrationOff_65();
  public void SlabTrapezoidIntegrationOff()
  {
    SlabTrapezoidIntegrationOff_65();
  }

  private native int GetSlabTrapezoidIntegration_66();
  public int GetSlabTrapezoidIntegration()
  {
    return GetSlabTrapezoidIntegration_66();
  }

  private native void SetSlabSliceSpacingFraction_67(double id0);
  public void SetSlabSliceSpacingFraction(double id0)
  {
    SetSlabSliceSpacingFraction_67(id0);
  }

  private native double GetSlabSliceSpacingFraction_68();
  public double GetSlabSliceSpacingFraction()
  {
    return GetSlabSliceSpacingFraction_68();
  }

  private native void SetOptimization_69(int id0);
  public void SetOptimization(int id0)
  {
    SetOptimization_69(id0);
  }

  private native int GetOptimization_70();
  public int GetOptimization()
  {
    return GetOptimization_70();
  }

  private native void OptimizationOn_71();
  public void OptimizationOn()
  {
    OptimizationOn_71();
  }

  private native void OptimizationOff_72();
  public void OptimizationOff()
  {
    OptimizationOff_72();
  }

  private native void SetScalarShift_73(double id0);
  public void SetScalarShift(double id0)
  {
    SetScalarShift_73(id0);
  }

  private native double GetScalarShift_74();
  public double GetScalarShift()
  {
    return GetScalarShift_74();
  }

  private native void SetScalarScale_75(double id0);
  public void SetScalarScale(double id0)
  {
    SetScalarScale_75(id0);
  }

  private native double GetScalarScale_76();
  public double GetScalarScale()
  {
    return GetScalarScale_76();
  }

  private native void SetOutputScalarType_77(int id0);
  public void SetOutputScalarType(int id0)
  {
    SetOutputScalarType_77(id0);
  }

  private native int GetOutputScalarType_78();
  public int GetOutputScalarType()
  {
    return GetOutputScalarType_78();
  }

  private native void SetBackgroundColor_79(double id0,double id1,double id2,double id3);
  public void SetBackgroundColor(double id0,double id1,double id2,double id3)
  {
    SetBackgroundColor_79(id0,id1,id2,id3);
  }

  private native void SetBackgroundColor_80(double id0[]);
  public void SetBackgroundColor(double id0[])
  {
    SetBackgroundColor_80(id0);
  }

  private native double[] GetBackgroundColor_81();
  public double[] GetBackgroundColor()
  {
    return GetBackgroundColor_81();
  }

  private native void SetBackgroundLevel_82(double id0);
  public void SetBackgroundLevel(double id0)
  {
    SetBackgroundLevel_82(id0);
  }

  private native double GetBackgroundLevel_83();
  public double GetBackgroundLevel()
  {
    return GetBackgroundLevel_83();
  }

  private native void SetOutputSpacing_84(double id0,double id1,double id2);
  public void SetOutputSpacing(double id0,double id1,double id2)
  {
    SetOutputSpacing_84(id0,id1,id2);
  }

  private native void SetOutputSpacing_85(double id0[]);
  public void SetOutputSpacing(double id0[])
  {
    SetOutputSpacing_85(id0);
  }

  private native double[] GetOutputSpacing_86();
  public double[] GetOutputSpacing()
  {
    return GetOutputSpacing_86();
  }

  private native void SetOutputSpacingToDefault_87();
  public void SetOutputSpacingToDefault()
  {
    SetOutputSpacingToDefault_87();
  }

  private native void SetOutputDirection_88(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8);
  public void SetOutputDirection(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8)
  {
    SetOutputDirection_88(id0,id1,id2,id3,id4,id5,id6,id7,id8);
  }

  private native void SetOutputDirection_89(double id0[]);
  public void SetOutputDirection(double id0[])
  {
    SetOutputDirection_89(id0);
  }

  private native double[] GetOutputDirection_90();
  public double[] GetOutputDirection()
  {
    return GetOutputDirection_90();
  }

  private native void SetOutputDirectionToDefault_91();
  public void SetOutputDirectionToDefault()
  {
    SetOutputDirectionToDefault_91();
  }

  private native void SetOutputOrigin_92(double id0,double id1,double id2);
  public void SetOutputOrigin(double id0,double id1,double id2)
  {
    SetOutputOrigin_92(id0,id1,id2);
  }

  private native void SetOutputOrigin_93(double id0[]);
  public void SetOutputOrigin(double id0[])
  {
    SetOutputOrigin_93(id0);
  }

  private native double[] GetOutputOrigin_94();
  public double[] GetOutputOrigin()
  {
    return GetOutputOrigin_94();
  }

  private native void SetOutputOriginToDefault_95();
  public void SetOutputOriginToDefault()
  {
    SetOutputOriginToDefault_95();
  }

  private native void SetOutputExtent_96(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetOutputExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetOutputExtent_96(id0,id1,id2,id3,id4,id5);
  }

  private native void SetOutputExtent_97(int id0[]);
  public void SetOutputExtent(int id0[])
  {
    SetOutputExtent_97(id0);
  }

  private native int[] GetOutputExtent_98();
  public int[] GetOutputExtent()
  {
    return GetOutputExtent_98();
  }

  private native void SetOutputExtentToDefault_99();
  public void SetOutputExtentToDefault()
  {
    SetOutputExtentToDefault_99();
  }

  private native void SetOutputDimensionality_100(int id0);
  public void SetOutputDimensionality(int id0)
  {
    SetOutputDimensionality_100(id0);
  }

  private native int GetOutputDimensionality_101();
  public int GetOutputDimensionality()
  {
    return GetOutputDimensionality_101();
  }

  private native long GetMTime_102();
  public long GetMTime()
  {
    return GetMTime_102();
  }

  private native void ReportReferences_103(vtkGarbageCollector id0);
  public void ReportReferences(vtkGarbageCollector id0)
  {
    ReportReferences_103(id0);
  }

  private native void SetInterpolate_104(int id0);
  public void SetInterpolate(int id0)
  {
    SetInterpolate_104(id0);
  }

  private native void InterpolateOn_105();
  public void InterpolateOn()
  {
    InterpolateOn_105();
  }

  private native void InterpolateOff_106();
  public void InterpolateOff()
  {
    InterpolateOff_106();
  }

  private native int GetInterpolate_107();
  public int GetInterpolate()
  {
    return GetInterpolate_107();
  }

  private native void SetStencilData_108(vtkImageStencilData id0);
  public void SetStencilData(vtkImageStencilData id0)
  {
    SetStencilData_108(id0);
  }

  private native long GetStencil_109();
  public vtkImageStencilData GetStencil()
  {
    long temp = GetStencil_109();

    if (temp == 0) return null;
    return (vtkImageStencilData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetGenerateStencilOutput_110(int id0);
  public void SetGenerateStencilOutput(int id0)
  {
    SetGenerateStencilOutput_110(id0);
  }

  private native int GetGenerateStencilOutput_111();
  public int GetGenerateStencilOutput()
  {
    return GetGenerateStencilOutput_111();
  }

  private native void GenerateStencilOutputOn_112();
  public void GenerateStencilOutputOn()
  {
    GenerateStencilOutputOn_112();
  }

  private native void GenerateStencilOutputOff_113();
  public void GenerateStencilOutputOff()
  {
    GenerateStencilOutputOff_113();
  }

  private native long GetStencilOutputPort_114();
  public vtkAlgorithmOutput GetStencilOutputPort()
  {
    long temp = GetStencilOutputPort_114();

    if (temp == 0) return null;
    return (vtkAlgorithmOutput)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetStencilOutput_115();
  public vtkImageStencilData GetStencilOutput()
  {
    long temp = GetStencilOutput_115();

    if (temp == 0) return null;
    return (vtkImageStencilData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetStencilOutput_116(vtkImageStencilData id0);
  public void SetStencilOutput(vtkImageStencilData id0)
  {
    SetStencilOutput_116(id0);
  }

  public vtkImageReslice() { super(); }

  public vtkImageReslice(long id) { super(id); }
  public native long   VTKInit();

}
