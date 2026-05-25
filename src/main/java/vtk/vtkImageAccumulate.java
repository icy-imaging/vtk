// java wrapper for vtkImageAccumulate object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageAccumulate extends vtkImageAlgorithm
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

  private native void SetComponentSpacing_4(double id0,double id1,double id2);
  public void SetComponentSpacing(double id0,double id1,double id2)
  {
    SetComponentSpacing_4(id0,id1,id2);
  }

  private native void SetComponentSpacing_5(double id0[]);
  public void SetComponentSpacing(double id0[])
  {
    SetComponentSpacing_5(id0);
  }

  private native double[] GetComponentSpacing_6();
  public double[] GetComponentSpacing()
  {
    return GetComponentSpacing_6();
  }

  private native void SetComponentOrigin_7(double id0,double id1,double id2);
  public void SetComponentOrigin(double id0,double id1,double id2)
  {
    SetComponentOrigin_7(id0,id1,id2);
  }

  private native void SetComponentOrigin_8(double id0[]);
  public void SetComponentOrigin(double id0[])
  {
    SetComponentOrigin_8(id0);
  }

  private native double[] GetComponentOrigin_9();
  public double[] GetComponentOrigin()
  {
    return GetComponentOrigin_9();
  }

  private native void SetComponentExtent_10(int id0[]);
  public void SetComponentExtent(int id0[])
  {
    SetComponentExtent_10(id0);
  }

  private native void SetComponentExtent_11(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetComponentExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetComponentExtent_11(id0,id1,id2,id3,id4,id5);
  }

  private native void GetComponentExtent_12(int id0[]);
  public void GetComponentExtent(int id0[])
  {
    GetComponentExtent_12(id0);
  }

  private native int[] GetComponentExtent_13();
  public int[] GetComponentExtent()
  {
    return GetComponentExtent_13();
  }

  private native void SetStencilData_14(vtkImageStencilData id0);
  public void SetStencilData(vtkImageStencilData id0)
  {
    SetStencilData_14(id0);
  }

  private native long GetStencil_15();
  public vtkImageStencilData GetStencil()
  {
    long temp = GetStencil_15();

    if (temp == 0) return null;
    return (vtkImageStencilData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetReverseStencil_16(int id0);
  public void SetReverseStencil(int id0)
  {
    SetReverseStencil_16(id0);
  }

  private native int GetReverseStencilMinValue_17();
  public int GetReverseStencilMinValue()
  {
    return GetReverseStencilMinValue_17();
  }

  private native int GetReverseStencilMaxValue_18();
  public int GetReverseStencilMaxValue()
  {
    return GetReverseStencilMaxValue_18();
  }

  private native void ReverseStencilOn_19();
  public void ReverseStencilOn()
  {
    ReverseStencilOn_19();
  }

  private native void ReverseStencilOff_20();
  public void ReverseStencilOff()
  {
    ReverseStencilOff_20();
  }

  private native int GetReverseStencil_21();
  public int GetReverseStencil()
  {
    return GetReverseStencil_21();
  }

  private native double[] GetMin_22();
  public double[] GetMin()
  {
    return GetMin_22();
  }

  private native double[] GetMax_23();
  public double[] GetMax()
  {
    return GetMax_23();
  }

  private native double[] GetMean_24();
  public double[] GetMean()
  {
    return GetMean_24();
  }

  private native double[] GetStandardDeviation_25();
  public double[] GetStandardDeviation()
  {
    return GetStandardDeviation_25();
  }

  private native long GetVoxelCount_26();
  public long GetVoxelCount()
  {
    return GetVoxelCount_26();
  }

  private native void SetIgnoreZero_27(int id0);
  public void SetIgnoreZero(int id0)
  {
    SetIgnoreZero_27(id0);
  }

  private native int GetIgnoreZeroMinValue_28();
  public int GetIgnoreZeroMinValue()
  {
    return GetIgnoreZeroMinValue_28();
  }

  private native int GetIgnoreZeroMaxValue_29();
  public int GetIgnoreZeroMaxValue()
  {
    return GetIgnoreZeroMaxValue_29();
  }

  private native int GetIgnoreZero_30();
  public int GetIgnoreZero()
  {
    return GetIgnoreZero_30();
  }

  private native void IgnoreZeroOn_31();
  public void IgnoreZeroOn()
  {
    IgnoreZeroOn_31();
  }

  private native void IgnoreZeroOff_32();
  public void IgnoreZeroOff()
  {
    IgnoreZeroOff_32();
  }

  public vtkImageAccumulate() { super(); }

  public vtkImageAccumulate(long id) { super(id); }
  public native long   VTKInit();

}
