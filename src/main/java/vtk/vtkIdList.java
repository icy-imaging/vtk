// java wrapper for vtkIdList object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkIdList extends vtkObject
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

  private native void Initialize_4();
  public void Initialize()
  {
    Initialize_4();
  }

  private native int Allocate_5(long id0,int id1);
  public int Allocate(long id0,int id1)
  {
    return Allocate_5(id0,id1);
  }

  private native long GetNumberOfIds_6();
  public long GetNumberOfIds()
  {
    return GetNumberOfIds_6();
  }

  private native long GetId_7(long id0);
  public long GetId(long id0)
  {
    return GetId_7(id0);
  }

  private native long FindIdLocation_8(long id0);
  public long FindIdLocation(long id0)
  {
    return FindIdLocation_8(id0);
  }

  private native void SetNumberOfIds_9(long id0);
  public void SetNumberOfIds(long id0)
  {
    SetNumberOfIds_9(id0);
  }

  private native void SetId_10(long id0,long id1);
  public void SetId(long id0,long id1)
  {
    SetId_10(id0,id1);
  }

  private native void InsertId_11(long id0,long id1);
  public void InsertId(long id0,long id1)
  {
    InsertId_11(id0,id1);
  }

  private native long InsertNextId_12(long id0);
  public long InsertNextId(long id0)
  {
    return InsertNextId_12(id0);
  }

  private native long InsertUniqueId_13(long id0);
  public long InsertUniqueId(long id0)
  {
    return InsertUniqueId_13(id0);
  }

  private native void Sort_14();
  public void Sort()
  {
    Sort_14();
  }

  private native void Fill_15(long id0);
  public void Fill(long id0)
  {
    Fill_15(id0);
  }

  private native void Reset_16();
  public void Reset()
  {
    Reset_16();
  }

  private native void Squeeze_17();
  public void Squeeze()
  {
    Squeeze_17();
  }

  private native void DeepCopy_18(vtkIdList id0);
  public void DeepCopy(vtkIdList id0)
  {
    DeepCopy_18(id0);
  }

  private native void DeleteId_19(long id0);
  public void DeleteId(long id0)
  {
    DeleteId_19(id0);
  }

  private native long IsId_20(long id0);
  public long IsId(long id0)
  {
    return IsId_20(id0);
  }

  private native void IntersectWith_21(vtkIdList id0);
  public void IntersectWith(vtkIdList id0)
  {
    IntersectWith_21(id0);
  }

  public vtkIdList() { super(); }

  public vtkIdList(long id) { super(id); }
  public native long   VTKInit();

}
