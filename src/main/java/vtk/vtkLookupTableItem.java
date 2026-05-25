// java wrapper for vtkLookupTableItem object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkLookupTableItem extends vtkScalarsToColorsItem
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

  private native void SetLookupTable_4(vtkLookupTable id0);
  public void SetLookupTable(vtkLookupTable id0)
  {
    SetLookupTable_4(id0);
  }

  private native long GetLookupTable_5();
  public vtkLookupTable GetLookupTable()
  {
    long temp = GetLookupTable_5();

    if (temp == 0) return null;
    return (vtkLookupTable)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  public vtkLookupTableItem() { super(); }

  public vtkLookupTableItem(long id) { super(id); }
  public native long   VTKInit();

}
