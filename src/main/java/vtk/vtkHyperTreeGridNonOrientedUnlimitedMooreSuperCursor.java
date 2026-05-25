// java wrapper for vtkHyperTreeGridNonOrientedUnlimitedMooreSuperCursor object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkHyperTreeGridNonOrientedUnlimitedMooreSuperCursor extends vtkHyperTreeGridNonOrientedUnlimitedSuperCursor
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

  private native void Initialize_4(vtkHyperTreeGrid id0,long id1,boolean id2);
  public void Initialize(vtkHyperTreeGrid id0,long id1,boolean id2)
  {
    Initialize_4(id0,id1,id2);
  }

  private native boolean GetCornerCursors_5(int id0,int id1,vtkIdList id2);
  public boolean GetCornerCursors(int id0,int id1,vtkIdList id2)
  {
    return GetCornerCursors_5(id0,id1,id2);
  }

  public vtkHyperTreeGridNonOrientedUnlimitedMooreSuperCursor() { super(); }

  public vtkHyperTreeGridNonOrientedUnlimitedMooreSuperCursor(long id) { super(id); }
  public native long   VTKInit();

}
