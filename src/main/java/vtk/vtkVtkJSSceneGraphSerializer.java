// java wrapper for vtkVtkJSSceneGraphSerializer object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkVtkJSSceneGraphSerializer extends vtkObject
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

  private native void Reset_4();
  public void Reset()
  {
    Reset_4();
  }

  private native long GetNumberOfDataObjects_5();
  public long GetNumberOfDataObjects()
  {
    return GetNumberOfDataObjects_5();
  }

  private native long GetDataObject_6(long id0);
  public vtkDataObject GetDataObject(long id0)
  {
    long temp = GetDataObject_6(id0);

    if (temp == 0) return null;
    return (vtkDataObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long GetNumberOfDataArrays_7();
  public long GetNumberOfDataArrays()
  {
    return GetNumberOfDataArrays_7();
  }

  private native byte[] GetDataArrayId_8(long id0);
  public String GetDataArrayId(long id0)
  {
    return new String(GetDataArrayId_8(id0), StandardCharsets.UTF_8);
  }

  private native long GetDataArray_9(long id0);
  public vtkDataArray GetDataArray(long id0)
  {
    long temp = GetDataArray_9(id0);

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Add_10(vtkViewNode id0,vtkActor id1);
  public void Add(vtkViewNode id0,vtkActor id1)
  {
    Add_10(id0,id1);
  }

  private native void Add_11(vtkViewNode id0,vtkCompositePolyDataMapper id1);
  public void Add(vtkViewNode id0,vtkCompositePolyDataMapper id1)
  {
    Add_11(id0,id1);
  }

  private native void Add_12(vtkViewNode id0,vtkGlyph3DMapper id1);
  public void Add(vtkViewNode id0,vtkGlyph3DMapper id1)
  {
    Add_12(id0,id1);
  }

  private native void Add_13(vtkViewNode id0,vtkMapper id1);
  public void Add(vtkViewNode id0,vtkMapper id1)
  {
    Add_13(id0,id1);
  }

  private native void Add_14(vtkViewNode id0,vtkRenderer id1);
  public void Add(vtkViewNode id0,vtkRenderer id1)
  {
    Add_14(id0,id1);
  }

  private native void Add_15(vtkViewNode id0,vtkRenderWindow id1);
  public void Add(vtkViewNode id0,vtkRenderWindow id1)
  {
    Add_15(id0,id1);
  }

  public vtkVtkJSSceneGraphSerializer() { super(); }

  public vtkVtkJSSceneGraphSerializer(long id) { super(id); }
  public native long   VTKInit();

}
