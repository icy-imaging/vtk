// java wrapper for vtkImageResliceMapper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageResliceMapper extends vtkImageMapper3D
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

  private native void SetSlicePlane_4(vtkPlane id0);
  public void SetSlicePlane(vtkPlane id0)
  {
    SetSlicePlane_4(id0);
  }

  private native void SetJumpToNearestSlice_5(int id0);
  public void SetJumpToNearestSlice(int id0)
  {
    SetJumpToNearestSlice_5(id0);
  }

  private native void JumpToNearestSliceOn_6();
  public void JumpToNearestSliceOn()
  {
    JumpToNearestSliceOn_6();
  }

  private native void JumpToNearestSliceOff_7();
  public void JumpToNearestSliceOff()
  {
    JumpToNearestSliceOff_7();
  }

  private native int GetJumpToNearestSlice_8();
  public int GetJumpToNearestSlice()
  {
    return GetJumpToNearestSlice_8();
  }

  private native void SetSlabThickness_9(double id0);
  public void SetSlabThickness(double id0)
  {
    SetSlabThickness_9(id0);
  }

  private native double GetSlabThickness_10();
  public double GetSlabThickness()
  {
    return GetSlabThickness_10();
  }

  private native void SetSlabType_11(int id0);
  public void SetSlabType(int id0)
  {
    SetSlabType_11(id0);
  }

  private native int GetSlabTypeMinValue_12();
  public int GetSlabTypeMinValue()
  {
    return GetSlabTypeMinValue_12();
  }

  private native int GetSlabTypeMaxValue_13();
  public int GetSlabTypeMaxValue()
  {
    return GetSlabTypeMaxValue_13();
  }

  private native int GetSlabType_14();
  public int GetSlabType()
  {
    return GetSlabType_14();
  }

  private native void SetSlabTypeToMin_15();
  public void SetSlabTypeToMin()
  {
    SetSlabTypeToMin_15();
  }

  private native void SetSlabTypeToMax_16();
  public void SetSlabTypeToMax()
  {
    SetSlabTypeToMax_16();
  }

  private native void SetSlabTypeToMean_17();
  public void SetSlabTypeToMean()
  {
    SetSlabTypeToMean_17();
  }

  private native void SetSlabTypeToSum_18();
  public void SetSlabTypeToSum()
  {
    SetSlabTypeToSum_18();
  }

  private native byte[] GetSlabTypeAsString_19();
  public String GetSlabTypeAsString()
  {
    return new String(GetSlabTypeAsString_19(), StandardCharsets.UTF_8);
  }

  private native void SetSlabSampleFactor_20(int id0);
  public void SetSlabSampleFactor(int id0)
  {
    SetSlabSampleFactor_20(id0);
  }

  private native int GetSlabSampleFactorMinValue_21();
  public int GetSlabSampleFactorMinValue()
  {
    return GetSlabSampleFactorMinValue_21();
  }

  private native int GetSlabSampleFactorMaxValue_22();
  public int GetSlabSampleFactorMaxValue()
  {
    return GetSlabSampleFactorMaxValue_22();
  }

  private native int GetSlabSampleFactor_23();
  public int GetSlabSampleFactor()
  {
    return GetSlabSampleFactor_23();
  }

  private native void SetImageSampleFactor_24(int id0);
  public void SetImageSampleFactor(int id0)
  {
    SetImageSampleFactor_24(id0);
  }

  private native int GetImageSampleFactorMinValue_25();
  public int GetImageSampleFactorMinValue()
  {
    return GetImageSampleFactorMinValue_25();
  }

  private native int GetImageSampleFactorMaxValue_26();
  public int GetImageSampleFactorMaxValue()
  {
    return GetImageSampleFactorMaxValue_26();
  }

  private native int GetImageSampleFactor_27();
  public int GetImageSampleFactor()
  {
    return GetImageSampleFactor_27();
  }

  private native void SetAutoAdjustImageQuality_28(int id0);
  public void SetAutoAdjustImageQuality(int id0)
  {
    SetAutoAdjustImageQuality_28(id0);
  }

  private native void AutoAdjustImageQualityOn_29();
  public void AutoAdjustImageQualityOn()
  {
    AutoAdjustImageQualityOn_29();
  }

  private native void AutoAdjustImageQualityOff_30();
  public void AutoAdjustImageQualityOff()
  {
    AutoAdjustImageQualityOff_30();
  }

  private native int GetAutoAdjustImageQuality_31();
  public int GetAutoAdjustImageQuality()
  {
    return GetAutoAdjustImageQuality_31();
  }

  private native void SetResampleToScreenPixels_32(int id0);
  public void SetResampleToScreenPixels(int id0)
  {
    SetResampleToScreenPixels_32(id0);
  }

  private native void ResampleToScreenPixelsOn_33();
  public void ResampleToScreenPixelsOn()
  {
    ResampleToScreenPixelsOn_33();
  }

  private native void ResampleToScreenPixelsOff_34();
  public void ResampleToScreenPixelsOff()
  {
    ResampleToScreenPixelsOff_34();
  }

  private native int GetResampleToScreenPixels_35();
  public int GetResampleToScreenPixels()
  {
    return GetResampleToScreenPixels_35();
  }

  private native void SetSeparateWindowLevelOperation_36(int id0);
  public void SetSeparateWindowLevelOperation(int id0)
  {
    SetSeparateWindowLevelOperation_36(id0);
  }

  private native void SeparateWindowLevelOperationOn_37();
  public void SeparateWindowLevelOperationOn()
  {
    SeparateWindowLevelOperationOn_37();
  }

  private native void SeparateWindowLevelOperationOff_38();
  public void SeparateWindowLevelOperationOff()
  {
    SeparateWindowLevelOperationOff_38();
  }

  private native int GetSeparateWindowLevelOperation_39();
  public int GetSeparateWindowLevelOperation()
  {
    return GetSeparateWindowLevelOperation_39();
  }

  private native void SetInterpolator_40(vtkAbstractImageInterpolator id0);
  public void SetInterpolator(vtkAbstractImageInterpolator id0)
  {
    SetInterpolator_40(id0);
  }

  private native long GetInterpolator_41();
  public vtkAbstractImageInterpolator GetInterpolator()
  {
    long temp = GetInterpolator_41();

    if (temp == 0) return null;
    return (vtkAbstractImageInterpolator)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Render_42(vtkRenderer id0,vtkImageSlice id1);
  public void Render(vtkRenderer id0,vtkImageSlice id1)
  {
    Render_42(id0,id1);
  }

  private native void ReleaseGraphicsResources_43(vtkWindow id0);
  public void ReleaseGraphicsResources(vtkWindow id0)
  {
    ReleaseGraphicsResources_43(id0);
  }

  private native long GetMTime_44();
  public long GetMTime()
  {
    return GetMTime_44();
  }

  private native void GetBounds_45(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_45(id0);
  }

  private native void GetIndexBounds_46(double id0[]);
  public void GetIndexBounds(double id0[])
  {
    GetIndexBounds_46(id0);
  }

  public vtkImageResliceMapper() { super(); }

  public vtkImageResliceMapper(long id) { super(id); }
  public native long   VTKInit();

}
