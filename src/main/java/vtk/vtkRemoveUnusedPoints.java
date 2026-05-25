// java wrapper for vtkRemoveUnusedPoints object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRemoveUnusedPoints extends vtkUnstructuredGridAlgorithm
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

  private native void SetGenerateOriginalPointIds_4(boolean id0);
  public void SetGenerateOriginalPointIds(boolean id0)
  {
    SetGenerateOriginalPointIds_4(id0);
  }

  private native boolean GetGenerateOriginalPointIds_5();
  public boolean GetGenerateOriginalPointIds()
  {
    return GetGenerateOriginalPointIds_5();
  }

  private native void GenerateOriginalPointIdsOn_6();
  public void GenerateOriginalPointIdsOn()
  {
    GenerateOriginalPointIdsOn_6();
  }

  private native void GenerateOriginalPointIdsOff_7();
  public void GenerateOriginalPointIdsOff()
  {
    GenerateOriginalPointIdsOff_7();
  }

  private native void SetOriginalPointIdsArrayName_8(byte[] id0, int len0);
  public void SetOriginalPointIdsArrayName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetOriginalPointIdsArrayName_8(bytes0, bytes0.length);
  }

  private native byte[] GetOriginalPointIdsArrayName_9();
  public String GetOriginalPointIdsArrayName()
  {
    return new String(GetOriginalPointIdsArrayName_9(), StandardCharsets.UTF_8);
  }

  public vtkRemoveUnusedPoints() { super(); }

  public vtkRemoveUnusedPoints(long id) { super(id); }
  public native long   VTKInit();

}
