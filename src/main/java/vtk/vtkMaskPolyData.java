// java wrapper for vtkMaskPolyData object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkMaskPolyData extends vtkPolyDataAlgorithm
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

  private native void SetOnRatio_4(int id0);
  public void SetOnRatio(int id0)
  {
    SetOnRatio_4(id0);
  }

  private native int GetOnRatioMinValue_5();
  public int GetOnRatioMinValue()
  {
    return GetOnRatioMinValue_5();
  }

  private native int GetOnRatioMaxValue_6();
  public int GetOnRatioMaxValue()
  {
    return GetOnRatioMaxValue_6();
  }

  private native int GetOnRatio_7();
  public int GetOnRatio()
  {
    return GetOnRatio_7();
  }

  private native void SetOffset_8(long id0);
  public void SetOffset(long id0)
  {
    SetOffset_8(id0);
  }

  private native long GetOffsetMinValue_9();
  public long GetOffsetMinValue()
  {
    return GetOffsetMinValue_9();
  }

  private native long GetOffsetMaxValue_10();
  public long GetOffsetMaxValue()
  {
    return GetOffsetMaxValue_10();
  }

  private native long GetOffset_11();
  public long GetOffset()
  {
    return GetOffset_11();
  }

  public vtkMaskPolyData() { super(); }

  public vtkMaskPolyData(long id) { super(id); }
  public native long   VTKInit();

}
