// java wrapper for vtkBandedPolyDataContourFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkBandedPolyDataContourFilter extends vtkPolyDataAlgorithm
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

  private native void SetValue_4(int id0,double id1);
  public void SetValue(int id0,double id1)
  {
    SetValue_4(id0,id1);
  }

  private native double GetValue_5(int id0);
  public double GetValue(int id0)
  {
    return GetValue_5(id0);
  }

  private native void SetNumberOfContours_6(int id0);
  public void SetNumberOfContours(int id0)
  {
    SetNumberOfContours_6(id0);
  }

  private native long GetNumberOfContours_7();
  public long GetNumberOfContours()
  {
    return GetNumberOfContours_7();
  }

  private native void GenerateValues_8(int id0,double id1[]);
  public void GenerateValues(int id0,double id1[])
  {
    GenerateValues_8(id0,id1);
  }

  private native void GenerateValues_9(int id0,double id1,double id2);
  public void GenerateValues(int id0,double id1,double id2)
  {
    GenerateValues_9(id0,id1,id2);
  }

  private native void SetClipping_10(int id0);
  public void SetClipping(int id0)
  {
    SetClipping_10(id0);
  }

  private native int GetClipping_11();
  public int GetClipping()
  {
    return GetClipping_11();
  }

  private native void ClippingOn_12();
  public void ClippingOn()
  {
    ClippingOn_12();
  }

  private native void ClippingOff_13();
  public void ClippingOff()
  {
    ClippingOff_13();
  }

  private native void SetScalarMode_14(int id0);
  public void SetScalarMode(int id0)
  {
    SetScalarMode_14(id0);
  }

  private native int GetScalarModeMinValue_15();
  public int GetScalarModeMinValue()
  {
    return GetScalarModeMinValue_15();
  }

  private native int GetScalarModeMaxValue_16();
  public int GetScalarModeMaxValue()
  {
    return GetScalarModeMaxValue_16();
  }

  private native int GetScalarMode_17();
  public int GetScalarMode()
  {
    return GetScalarMode_17();
  }

  private native void SetScalarModeToIndex_18();
  public void SetScalarModeToIndex()
  {
    SetScalarModeToIndex_18();
  }

  private native void SetScalarModeToValue_19();
  public void SetScalarModeToValue()
  {
    SetScalarModeToValue_19();
  }

  private native void SetGenerateContourEdges_20(int id0);
  public void SetGenerateContourEdges(int id0)
  {
    SetGenerateContourEdges_20(id0);
  }

  private native int GetGenerateContourEdges_21();
  public int GetGenerateContourEdges()
  {
    return GetGenerateContourEdges_21();
  }

  private native void GenerateContourEdgesOn_22();
  public void GenerateContourEdgesOn()
  {
    GenerateContourEdgesOn_22();
  }

  private native void GenerateContourEdgesOff_23();
  public void GenerateContourEdgesOff()
  {
    GenerateContourEdgesOff_23();
  }

  private native void SetClipTolerance_24(double id0);
  public void SetClipTolerance(double id0)
  {
    SetClipTolerance_24(id0);
  }

  private native double GetClipTolerance_25();
  public double GetClipTolerance()
  {
    return GetClipTolerance_25();
  }

  private native void SetComponent_26(int id0);
  public void SetComponent(int id0)
  {
    SetComponent_26(id0);
  }

  private native int GetComponent_27();
  public int GetComponent()
  {
    return GetComponent_27();
  }

  private native long GetContourEdgesOutput_28();
  public vtkPolyData GetContourEdgesOutput()
  {
    long temp = GetContourEdgesOutput_28();

    if (temp == 0) return null;
    return (vtkPolyData)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetMTime_29();
  public long GetMTime()
  {
    return GetMTime_29();
  }

  public vtkBandedPolyDataContourFilter() { super(); }

  public vtkBandedPolyDataContourFilter(long id) { super(id); }
  public native long   VTKInit();

}
