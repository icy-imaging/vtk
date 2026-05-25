// java wrapper for vtkDataObjectMeshCache object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataObjectMeshCache extends vtkObject
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

  private native void SetConsumer_4(vtkAlgorithm id0);
  public void SetConsumer(vtkAlgorithm id0)
  {
    SetConsumer_4(id0);
  }

  private native void SetOriginalDataObject_5(vtkDataObject id0);
  public void SetOriginalDataObject(vtkDataObject id0)
  {
    SetOriginalDataObject_5(id0);
  }

  private native void AddOriginalIds_6(int id0,byte[] id1, int len1);
  public void AddOriginalIds(int id0,String id1)
  {
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddOriginalIds_6(id0,bytes1, bytes1.length);
  }

  private native void RemoveOriginalIds_7(int id0);
  public void RemoveOriginalIds(int id0)
  {
    RemoveOriginalIds_7(id0);
  }

  private native void ClearOriginalIds_8();
  public void ClearOriginalIds()
  {
    ClearOriginalIds_8();
  }

  private native void CopyCacheToDataObject_9(vtkDataObject id0);
  public void CopyCacheToDataObject(vtkDataObject id0)
  {
    CopyCacheToDataObject_9(id0);
  }

  private native void UpdateCache_10(vtkDataObject id0);
  public void UpdateCache(vtkDataObject id0)
  {
    UpdateCache_10(id0);
  }

  private native void InvalidateCache_11();
  public void InvalidateCache()
  {
    InvalidateCache_11();
  }

  private native boolean IsSupportedData_12(vtkDataObject id0);
  public boolean IsSupportedData(vtkDataObject id0)
  {
    return IsSupportedData_12(id0);
  }

  public vtkDataObjectMeshCache() { super(); }

  public vtkDataObjectMeshCache(long id) { super(id); }
  public native long   VTKInit();

}
