// java wrapper for vtkTreeFieldAggregator object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTreeFieldAggregator extends vtkTreeAlgorithm
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

  private native byte[] GetField_4();
  public String GetField()
  {
    return new String(GetField_4(), StandardCharsets.UTF_8);
  }

  private native void SetField_5(byte[] id0, int len0);
  public void SetField(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetField_5(bytes0, bytes0.length);
  }

  private native double GetMinValue_6();
  public double GetMinValue()
  {
    return GetMinValue_6();
  }

  private native void SetMinValue_7(double id0);
  public void SetMinValue(double id0)
  {
    SetMinValue_7(id0);
  }

  private native void SetLeafVertexUnitSize_8(boolean id0);
  public void SetLeafVertexUnitSize(boolean id0)
  {
    SetLeafVertexUnitSize_8(id0);
  }

  private native boolean GetLeafVertexUnitSize_9();
  public boolean GetLeafVertexUnitSize()
  {
    return GetLeafVertexUnitSize_9();
  }

  private native void LeafVertexUnitSizeOn_10();
  public void LeafVertexUnitSizeOn()
  {
    LeafVertexUnitSizeOn_10();
  }

  private native void LeafVertexUnitSizeOff_11();
  public void LeafVertexUnitSizeOff()
  {
    LeafVertexUnitSizeOff_11();
  }

  private native void SetLogScale_12(boolean id0);
  public void SetLogScale(boolean id0)
  {
    SetLogScale_12(id0);
  }

  private native boolean GetLogScale_13();
  public boolean GetLogScale()
  {
    return GetLogScale_13();
  }

  private native void LogScaleOn_14();
  public void LogScaleOn()
  {
    LogScaleOn_14();
  }

  private native void LogScaleOff_15();
  public void LogScaleOff()
  {
    LogScaleOff_15();
  }

  public vtkTreeFieldAggregator() { super(); }

  public vtkTreeFieldAggregator(long id) { super(id); }
  public native long   VTKInit();

}
