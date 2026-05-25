// java wrapper for vtkImageActor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageActor extends vtkImageSlice
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

  private native void SetInputData_4(vtkImageData id0);
  public void SetInputData(vtkImageData id0)
  {
    SetInputData_4(id0);
  }

  private native long GetInput_5();
  public vtkImageData GetInput()
  {
    long temp = GetInput_5();

    if (temp == 0) return null;
    return (vtkImageData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetInterpolate_6(int id0);
  public void SetInterpolate(int id0)
  {
    SetInterpolate_6(id0);
  }

  private native int GetInterpolate_7();
  public int GetInterpolate()
  {
    return GetInterpolate_7();
  }

  private native void InterpolateOn_8();
  public void InterpolateOn()
  {
    InterpolateOn_8();
  }

  private native void InterpolateOff_9();
  public void InterpolateOff()
  {
    InterpolateOff_9();
  }

  private native void SetOpacity_10(double id0);
  public void SetOpacity(double id0)
  {
    SetOpacity_10(id0);
  }

  private native double GetOpacity_11();
  public double GetOpacity()
  {
    return GetOpacity_11();
  }

  private native double GetOpacityMinValue_12();
  public double GetOpacityMinValue()
  {
    return GetOpacityMinValue_12();
  }

  private native double GetOpacityMaxValue_13();
  public double GetOpacityMaxValue()
  {
    return GetOpacityMaxValue_13();
  }

  private native void SetDisplayExtent_14(int id0[]);
  public void SetDisplayExtent(int id0[])
  {
    SetDisplayExtent_14(id0);
  }

  private native void SetDisplayExtent_15(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetDisplayExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetDisplayExtent_15(id0,id1,id2,id3,id4,id5);
  }

  private native void GetDisplayExtent_16(int id0[]);
  public void GetDisplayExtent(int id0[])
  {
    GetDisplayExtent_16(id0);
  }

  private native int[] GetDisplayExtent_17();
  public int[] GetDisplayExtent()
  {
    return GetDisplayExtent_17();
  }

  private native double[] GetBounds_18();
  public double[] GetBounds()
  {
    return GetBounds_18();
  }

  private native void GetBounds_19(double id0[]);
  public void GetBounds(double id0[])
  {
    GetBounds_19(id0);
  }

  private native double[] GetDisplayBounds_20();
  public double[] GetDisplayBounds()
  {
    return GetDisplayBounds_20();
  }

  private native void GetDisplayBounds_21(double id0[]);
  public void GetDisplayBounds(double id0[])
  {
    GetDisplayBounds_21(id0);
  }

  private native int GetSliceNumber_22();
  public int GetSliceNumber()
  {
    return GetSliceNumber_22();
  }

  private native int GetSliceNumberMax_23();
  public int GetSliceNumberMax()
  {
    return GetSliceNumberMax_23();
  }

  private native int GetSliceNumberMin_24();
  public int GetSliceNumberMin()
  {
    return GetSliceNumberMin_24();
  }

  private native void SetZSlice_25(int id0);
  public void SetZSlice(int id0)
  {
    SetZSlice_25(id0);
  }

  private native int GetZSlice_26();
  public int GetZSlice()
  {
    return GetZSlice_26();
  }

  private native int GetWholeZMin_27();
  public int GetWholeZMin()
  {
    return GetWholeZMin_27();
  }

  private native int GetWholeZMax_28();
  public int GetWholeZMax()
  {
    return GetWholeZMax_28();
  }

  private native int HasTranslucentPolygonalGeometry_29();
  public int HasTranslucentPolygonalGeometry()
  {
    return HasTranslucentPolygonalGeometry_29();
  }

  private native boolean GetForceOpaque_30();
  public boolean GetForceOpaque()
  {
    return GetForceOpaque_30();
  }

  private native void SetForceOpaque_31(boolean id0);
  public void SetForceOpaque(boolean id0)
  {
    SetForceOpaque_31(id0);
  }

  private native void ForceOpaqueOn_32();
  public void ForceOpaqueOn()
  {
    ForceOpaqueOn_32();
  }

  private native void ForceOpaqueOff_33();
  public void ForceOpaqueOff()
  {
    ForceOpaqueOff_33();
  }

  public vtkImageActor() { super(); }

  public vtkImageActor(long id) { super(id); }
  public native long   VTKInit();

}
