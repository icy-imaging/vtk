// java wrapper for vtkPointDensityFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkPointDensityFilter extends vtkImageAlgorithm
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

  private native void SetSampleDimensions_4(int id0,int id1,int id2);
  public void SetSampleDimensions(int id0,int id1,int id2)
  {
    SetSampleDimensions_4(id0,id1,id2);
  }

  private native void SetSampleDimensions_5(int id0[]);
  public void SetSampleDimensions(int id0[])
  {
    SetSampleDimensions_5(id0);
  }

  private native int[] GetSampleDimensions_6();
  public int[] GetSampleDimensions()
  {
    return GetSampleDimensions_6();
  }

  private native void SetModelBounds_7(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetModelBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetModelBounds_7(id0,id1,id2,id3,id4,id5);
  }

  private native void SetModelBounds_8(double id0[]);
  public void SetModelBounds(double id0[])
  {
    SetModelBounds_8(id0);
  }

  private native double[] GetModelBounds_9();
  public double[] GetModelBounds()
  {
    return GetModelBounds_9();
  }

  private native void SetAdjustDistance_10(double id0);
  public void SetAdjustDistance(double id0)
  {
    SetAdjustDistance_10(id0);
  }

  private native double GetAdjustDistanceMinValue_11();
  public double GetAdjustDistanceMinValue()
  {
    return GetAdjustDistanceMinValue_11();
  }

  private native double GetAdjustDistanceMaxValue_12();
  public double GetAdjustDistanceMaxValue()
  {
    return GetAdjustDistanceMaxValue_12();
  }

  private native double GetAdjustDistance_13();
  public double GetAdjustDistance()
  {
    return GetAdjustDistance_13();
  }

  private native void SetDensityEstimate_14(int id0);
  public void SetDensityEstimate(int id0)
  {
    SetDensityEstimate_14(id0);
  }

  private native int GetDensityEstimateMinValue_15();
  public int GetDensityEstimateMinValue()
  {
    return GetDensityEstimateMinValue_15();
  }

  private native int GetDensityEstimateMaxValue_16();
  public int GetDensityEstimateMaxValue()
  {
    return GetDensityEstimateMaxValue_16();
  }

  private native int GetDensityEstimate_17();
  public int GetDensityEstimate()
  {
    return GetDensityEstimate_17();
  }

  private native void SetDensityEstimateToFixedRadius_18();
  public void SetDensityEstimateToFixedRadius()
  {
    SetDensityEstimateToFixedRadius_18();
  }

  private native void SetDensityEstimateToRelativeRadius_19();
  public void SetDensityEstimateToRelativeRadius()
  {
    SetDensityEstimateToRelativeRadius_19();
  }

  private native byte[] GetDensityEstimateAsString_20();
  public String GetDensityEstimateAsString()
  {
    return new String(GetDensityEstimateAsString_20(), StandardCharsets.UTF_8);
  }

  private native void SetDensityForm_21(int id0);
  public void SetDensityForm(int id0)
  {
    SetDensityForm_21(id0);
  }

  private native int GetDensityFormMinValue_22();
  public int GetDensityFormMinValue()
  {
    return GetDensityFormMinValue_22();
  }

  private native int GetDensityFormMaxValue_23();
  public int GetDensityFormMaxValue()
  {
    return GetDensityFormMaxValue_23();
  }

  private native int GetDensityForm_24();
  public int GetDensityForm()
  {
    return GetDensityForm_24();
  }

  private native void SetDensityFormToVolumeNormalized_25();
  public void SetDensityFormToVolumeNormalized()
  {
    SetDensityFormToVolumeNormalized_25();
  }

  private native void SetDensityFormToNumberOfPoints_26();
  public void SetDensityFormToNumberOfPoints()
  {
    SetDensityFormToNumberOfPoints_26();
  }

  private native byte[] GetDensityFormAsString_27();
  public String GetDensityFormAsString()
  {
    return new String(GetDensityFormAsString_27(), StandardCharsets.UTF_8);
  }

  private native void SetRadius_28(double id0);
  public void SetRadius(double id0)
  {
    SetRadius_28(id0);
  }

  private native double GetRadiusMinValue_29();
  public double GetRadiusMinValue()
  {
    return GetRadiusMinValue_29();
  }

  private native double GetRadiusMaxValue_30();
  public double GetRadiusMaxValue()
  {
    return GetRadiusMaxValue_30();
  }

  private native double GetRadius_31();
  public double GetRadius()
  {
    return GetRadius_31();
  }

  private native void SetRelativeRadius_32(double id0);
  public void SetRelativeRadius(double id0)
  {
    SetRelativeRadius_32(id0);
  }

  private native double GetRelativeRadiusMinValue_33();
  public double GetRelativeRadiusMinValue()
  {
    return GetRelativeRadiusMinValue_33();
  }

  private native double GetRelativeRadiusMaxValue_34();
  public double GetRelativeRadiusMaxValue()
  {
    return GetRelativeRadiusMaxValue_34();
  }

  private native double GetRelativeRadius_35();
  public double GetRelativeRadius()
  {
    return GetRelativeRadius_35();
  }

  private native void SetScalarWeighting_36(boolean id0);
  public void SetScalarWeighting(boolean id0)
  {
    SetScalarWeighting_36(id0);
  }

  private native boolean GetScalarWeighting_37();
  public boolean GetScalarWeighting()
  {
    return GetScalarWeighting_37();
  }

  private native void ScalarWeightingOn_38();
  public void ScalarWeightingOn()
  {
    ScalarWeightingOn_38();
  }

  private native void ScalarWeightingOff_39();
  public void ScalarWeightingOff()
  {
    ScalarWeightingOff_39();
  }

  private native void SetComputeGradient_40(boolean id0);
  public void SetComputeGradient(boolean id0)
  {
    SetComputeGradient_40(id0);
  }

  private native boolean GetComputeGradient_41();
  public boolean GetComputeGradient()
  {
    return GetComputeGradient_41();
  }

  private native void ComputeGradientOn_42();
  public void ComputeGradientOn()
  {
    ComputeGradientOn_42();
  }

  private native void ComputeGradientOff_43();
  public void ComputeGradientOff()
  {
    ComputeGradientOff_43();
  }

  private native void SetLocator_44(vtkAbstractPointLocator id0);
  public void SetLocator(vtkAbstractPointLocator id0)
  {
    SetLocator_44(id0);
  }

  private native long GetLocator_45();
  public vtkAbstractPointLocator GetLocator()
  {
    long temp = GetLocator_45();

    if (temp == 0) return null;
    return (vtkAbstractPointLocator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkPointDensityFilter() { super(); }

  public vtkPointDensityFilter(long id) { super(id); }
  public native long   VTKInit();

}
