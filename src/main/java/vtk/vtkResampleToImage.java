// java wrapper for vtkResampleToImage object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkResampleToImage extends vtkAlgorithm
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

  private native void SetUseInputBounds_4(boolean id0);
  public void SetUseInputBounds(boolean id0)
  {
    SetUseInputBounds_4(id0);
  }

  private native boolean GetUseInputBounds_5();
  public boolean GetUseInputBounds()
  {
    return GetUseInputBounds_5();
  }

  private native void UseInputBoundsOn_6();
  public void UseInputBoundsOn()
  {
    UseInputBoundsOn_6();
  }

  private native void UseInputBoundsOff_7();
  public void UseInputBoundsOff()
  {
    UseInputBoundsOff_7();
  }

  private native void SetSamplingBounds_8(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetSamplingBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetSamplingBounds_8(id0,id1,id2,id3,id4,id5);
  }

  private native void SetSamplingBounds_9(double id0[]);
  public void SetSamplingBounds(double id0[])
  {
    SetSamplingBounds_9(id0);
  }

  private native double[] GetSamplingBounds_10();
  public double[] GetSamplingBounds()
  {
    return GetSamplingBounds_10();
  }

  private native void SetSamplingDimensions_11(int id0,int id1,int id2);
  public void SetSamplingDimensions(int id0,int id1,int id2)
  {
    SetSamplingDimensions_11(id0,id1,id2);
  }

  private native void SetSamplingDimensions_12(int id0[]);
  public void SetSamplingDimensions(int id0[])
  {
    SetSamplingDimensions_12(id0);
  }

  private native int[] GetSamplingDimensions_13();
  public int[] GetSamplingDimensions()
  {
    return GetSamplingDimensions_13();
  }

  private native long GetOutput_14();
  public vtkImageData GetOutput()
  {
    long temp = GetOutput_14();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native byte[] GetMaskArrayName_15();
  public String GetMaskArrayName()
  {
    return new String(GetMaskArrayName_15(), StandardCharsets.UTF_8);
  }

  public vtkResampleToImage() { super(); }

  public vtkResampleToImage(long id) { super(id); }
  public native long   VTKInit();

}
