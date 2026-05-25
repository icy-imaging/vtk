// java wrapper for vtkHyperTreeGridAxisClip object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGridAxisClip extends vtkHyperTreeGridAlgorithm
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

  private native void SetClipType_4(int id0);
  public void SetClipType(int id0)
  {
    SetClipType_4(id0);
  }

  private native int GetClipTypeMinValue_5();
  public int GetClipTypeMinValue()
  {
    return GetClipTypeMinValue_5();
  }

  private native int GetClipTypeMaxValue_6();
  public int GetClipTypeMaxValue()
  {
    return GetClipTypeMaxValue_6();
  }

  private native int GetClipType_7();
  public int GetClipType()
  {
    return GetClipType_7();
  }

  private native void SetClipTypeToPlane_8();
  public void SetClipTypeToPlane()
  {
    SetClipTypeToPlane_8();
  }

  private native void SetClipTypeToBox_9();
  public void SetClipTypeToBox()
  {
    SetClipTypeToBox_9();
  }

  private native void SetClipTypeToQuadric_10();
  public void SetClipTypeToQuadric()
  {
    SetClipTypeToQuadric_10();
  }

  private native void SetPlaneNormalAxis_11(int id0);
  public void SetPlaneNormalAxis(int id0)
  {
    SetPlaneNormalAxis_11(id0);
  }

  private native int GetPlaneNormalAxisMinValue_12();
  public int GetPlaneNormalAxisMinValue()
  {
    return GetPlaneNormalAxisMinValue_12();
  }

  private native int GetPlaneNormalAxisMaxValue_13();
  public int GetPlaneNormalAxisMaxValue()
  {
    return GetPlaneNormalAxisMaxValue_13();
  }

  private native int GetPlaneNormalAxis_14();
  public int GetPlaneNormalAxis()
  {
    return GetPlaneNormalAxis_14();
  }

  private native void SetPlanePosition_15(double id0);
  public void SetPlanePosition(double id0)
  {
    SetPlanePosition_15(id0);
  }

  private native double GetPlanePosition_16();
  public double GetPlanePosition()
  {
    return GetPlanePosition_16();
  }

  private native void SetBounds_17(double id0,double id1,double id2,double id3,double id4,double id5);
  public void SetBounds(double id0,double id1,double id2,double id3,double id4,double id5)
  {
    SetBounds_17(id0,id1,id2,id3,id4,id5);
  }

  private native void SetBounds_18(double id0[]);
  public void SetBounds(double id0[])
  {
    SetBounds_18(id0);
  }

  private native double[] GetBounds_19();
  public double[] GetBounds()
  {
    return GetBounds_19();
  }

  private native void GetMinimumBounds_20(double id0[]);
  public void GetMinimumBounds(double id0[])
  {
    GetMinimumBounds_20(id0);
  }

  private native void GetMaximumBounds_21(double id0[]);
  public void GetMaximumBounds(double id0[])
  {
    GetMaximumBounds_21(id0);
  }

  private native void SetInsideOut_22(boolean id0);
  public void SetInsideOut(boolean id0)
  {
    SetInsideOut_22(id0);
  }

  private native boolean GetInsideOut_23();
  public boolean GetInsideOut()
  {
    return GetInsideOut_23();
  }

  private native void InsideOutOn_24();
  public void InsideOutOn()
  {
    InsideOutOn_24();
  }

  private native void InsideOutOff_25();
  public void InsideOutOff()
  {
    InsideOutOff_25();
  }

  private native void SetQuadric_26(vtkQuadric id0);
  public void SetQuadric(vtkQuadric id0)
  {
    SetQuadric_26(id0);
  }

  private native long GetQuadric_27();
  public vtkQuadric GetQuadric()
  {
    long temp = GetQuadric_27();

    if (temp == 0) return null;
    return (vtkQuadric)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetQuadricCoefficients_28(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8,double id9);
  public void SetQuadricCoefficients(double id0,double id1,double id2,double id3,double id4,double id5,double id6,double id7,double id8,double id9)
  {
    SetQuadricCoefficients_28(id0,id1,id2,id3,id4,id5,id6,id7,id8,id9);
  }

  private native void SetQuadricCoefficients_29(double id0[]);
  public void SetQuadricCoefficients(double id0[])
  {
    SetQuadricCoefficients_29(id0);
  }

  private native void GetQuadricCoefficients_30(double id0[]);
  public void GetQuadricCoefficients(double id0[])
  {
    GetQuadricCoefficients_30(id0);
  }

  private native long GetMTime_31();
  public long GetMTime()
  {
    return GetMTime_31();
  }

  public vtkHyperTreeGridAxisClip() { super(); }

  public vtkHyperTreeGridAxisClip(long id) { super(id); }
  public native long   VTKInit();

}
