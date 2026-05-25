// java wrapper for vtkImageDataToUniformGrid object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageDataToUniformGrid extends vtkDataObjectAlgorithm
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

  private native void SetReverse_4(int id0);
  public void SetReverse(int id0)
  {
    SetReverse_4(id0);
  }

  private native int GetReverseMinValue_5();
  public int GetReverseMinValue()
  {
    return GetReverseMinValue_5();
  }

  private native int GetReverseMaxValue_6();
  public int GetReverseMaxValue()
  {
    return GetReverseMaxValue_6();
  }

  private native int GetReverse_7();
  public int GetReverse()
  {
    return GetReverse_7();
  }

  private native void ReverseOn_8();
  public void ReverseOn()
  {
    ReverseOn_8();
  }

  private native void ReverseOff_9();
  public void ReverseOff()
  {
    ReverseOff_9();
  }

  public vtkImageDataToUniformGrid() { super(); }

  public vtkImageDataToUniformGrid(long id) { super(id); }
  public native long   VTKInit();

}
