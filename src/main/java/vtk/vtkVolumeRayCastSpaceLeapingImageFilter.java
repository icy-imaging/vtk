// java wrapper for vtkVolumeRayCastSpaceLeapingImageFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVolumeRayCastSpaceLeapingImageFilter extends vtkThreadedImageAlgorithm
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

  private native void SetCurrentScalars_4(vtkDataArray id0);
  public void SetCurrentScalars(vtkDataArray id0)
  {
    SetCurrentScalars_4(id0);
  }

  private native long GetCurrentScalars_5();
  public vtkDataArray GetCurrentScalars()
  {
    long temp = GetCurrentScalars_5();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetIndependentComponents_6(int id0);
  public void SetIndependentComponents(int id0)
  {
    SetIndependentComponents_6(id0);
  }

  private native int GetIndependentComponents_7();
  public int GetIndependentComponents()
  {
    return GetIndependentComponents_7();
  }

  private native void SetComputeGradientOpacity_8(int id0);
  public void SetComputeGradientOpacity(int id0)
  {
    SetComputeGradientOpacity_8(id0);
  }

  private native int GetComputeGradientOpacity_9();
  public int GetComputeGradientOpacity()
  {
    return GetComputeGradientOpacity_9();
  }

  private native void ComputeGradientOpacityOn_10();
  public void ComputeGradientOpacityOn()
  {
    ComputeGradientOpacityOn_10();
  }

  private native void ComputeGradientOpacityOff_11();
  public void ComputeGradientOpacityOff()
  {
    ComputeGradientOpacityOff_11();
  }

  private native void SetComputeMinMax_12(int id0);
  public void SetComputeMinMax(int id0)
  {
    SetComputeMinMax_12(id0);
  }

  private native int GetComputeMinMax_13();
  public int GetComputeMinMax()
  {
    return GetComputeMinMax_13();
  }

  private native void ComputeMinMaxOn_14();
  public void ComputeMinMaxOn()
  {
    ComputeMinMaxOn_14();
  }

  private native void ComputeMinMaxOff_15();
  public void ComputeMinMaxOff()
  {
    ComputeMinMaxOff_15();
  }

  private native void SetUpdateGradientOpacityFlags_16(int id0);
  public void SetUpdateGradientOpacityFlags(int id0)
  {
    SetUpdateGradientOpacityFlags_16(id0);
  }

  private native int GetUpdateGradientOpacityFlags_17();
  public int GetUpdateGradientOpacityFlags()
  {
    return GetUpdateGradientOpacityFlags_17();
  }

  private native void UpdateGradientOpacityFlagsOn_18();
  public void UpdateGradientOpacityFlagsOn()
  {
    UpdateGradientOpacityFlagsOn_18();
  }

  private native void UpdateGradientOpacityFlagsOff_19();
  public void UpdateGradientOpacityFlagsOff()
  {
    UpdateGradientOpacityFlagsOff_19();
  }

  private native long GetLastMinMaxBuildTime_20();
  public long GetLastMinMaxBuildTime()
  {
    return GetLastMinMaxBuildTime_20();
  }

  private native long GetLastMinMaxFlagTime_21();
  public long GetLastMinMaxFlagTime()
  {
    return GetLastMinMaxFlagTime_21();
  }

  private native void SetTableShift_22(float id0,float id1,float id2,float id3);
  public void SetTableShift(float id0,float id1,float id2,float id3)
  {
    SetTableShift_22(id0,id1,id2,id3);
  }

  private native void SetTableShift_23(float id0[]);
  public void SetTableShift(float id0[])
  {
    SetTableShift_23(id0);
  }

  private native float[] GetTableShift_24();
  public float[] GetTableShift()
  {
    return GetTableShift_24();
  }

  private native void SetTableScale_25(float id0,float id1,float id2,float id3);
  public void SetTableScale(float id0,float id1,float id2,float id3)
  {
    SetTableScale_25(id0,id1,id2,id3);
  }

  private native void SetTableScale_26(float id0[]);
  public void SetTableScale(float id0[])
  {
    SetTableScale_26(id0);
  }

  private native float[] GetTableScale_27();
  public float[] GetTableScale()
  {
    return GetTableScale_27();
  }

  private native void SetTableSize_28(int id0,int id1,int id2,int id3);
  public void SetTableSize(int id0,int id1,int id2,int id3)
  {
    SetTableSize_28(id0,id1,id2,id3);
  }

  private native void SetTableSize_29(int id0[]);
  public void SetTableSize(int id0[])
  {
    SetTableSize_29(id0);
  }

  private native int[] GetTableSize_30();
  public int[] GetTableSize()
  {
    return GetTableSize_30();
  }

  private native int GetNumberOfIndependentComponents_31();
  public int GetNumberOfIndependentComponents()
  {
    return GetNumberOfIndependentComponents_31();
  }

  private native void SetCache_32(vtkImageData id0);
  public void SetCache(vtkImageData id0)
  {
    SetCache_32(id0);
  }

  private native void ComputeInputExtentsForOutput_33(int id0[],int id1[],int id2[],vtkImageData id3);
  public void ComputeInputExtentsForOutput(int id0[],int id1[],int id2[],vtkImageData id3)
  {
    ComputeInputExtentsForOutput_33(id0,id1,id2,id3);
  }

  private native long ComputeOffset_34(int id0[],int id1[],int id2);
  public long ComputeOffset(int id0[],int id1[],int id2)
  {
    return ComputeOffset_34(id0,id1,id2);
  }

  public vtkVolumeRayCastSpaceLeapingImageFilter() { super(); }

  public vtkVolumeRayCastSpaceLeapingImageFilter(long id) { super(id); }
  public native long   VTKInit();

}
