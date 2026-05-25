// java wrapper for vtkOctreeImageToPointSetFilter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkOctreeImageToPointSetFilter extends vtkPolyDataAlgorithm
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

  private native void SetCreateVerticesCellArray_4(boolean id0);
  public void SetCreateVerticesCellArray(boolean id0)
  {
    SetCreateVerticesCellArray_4(id0);
  }

  private native boolean GetCreateVerticesCellArray_5();
  public boolean GetCreateVerticesCellArray()
  {
    return GetCreateVerticesCellArray_5();
  }

  private native void CreateVerticesCellArrayOn_6();
  public void CreateVerticesCellArrayOn()
  {
    CreateVerticesCellArrayOn_6();
  }

  private native void CreateVerticesCellArrayOff_7();
  public void CreateVerticesCellArrayOff()
  {
    CreateVerticesCellArrayOff_7();
  }

  private native void SetProcessInputCellArray_8(boolean id0);
  public void SetProcessInputCellArray(boolean id0)
  {
    SetProcessInputCellArray_8(id0);
  }

  private native boolean GetProcessInputCellArray_9();
  public boolean GetProcessInputCellArray()
  {
    return GetProcessInputCellArray_9();
  }

  private native void ProcessInputCellArrayOn_10();
  public void ProcessInputCellArrayOn()
  {
    ProcessInputCellArrayOn_10();
  }

  private native void ProcessInputCellArrayOff_11();
  public void ProcessInputCellArrayOff()
  {
    ProcessInputCellArrayOff_11();
  }

  private native void SetCellArrayComponent_12(int id0);
  public void SetCellArrayComponent(int id0)
  {
    SetCellArrayComponent_12(id0);
  }

  private native int GetCellArrayComponentMinValue_13();
  public int GetCellArrayComponentMinValue()
  {
    return GetCellArrayComponentMinValue_13();
  }

  private native int GetCellArrayComponentMaxValue_14();
  public int GetCellArrayComponentMaxValue()
  {
    return GetCellArrayComponentMaxValue_14();
  }

  private native int GetCellArrayComponent_15();
  public int GetCellArrayComponent()
  {
    return GetCellArrayComponent_15();
  }

  public vtkOctreeImageToPointSetFilter() { super(); }

  public vtkOctreeImageToPointSetFilter(long id) { super(id); }
  public native long   VTKInit();

}
