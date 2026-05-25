// java wrapper for vtkURILoader object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkURILoader extends vtkObject
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

  private native boolean SetBaseURI_4(byte[] id0, int len0);
  public boolean SetBaseURI(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetBaseURI_4(bytes0, bytes0.length);
  }

  private native boolean SetBaseURI_5(vtkURI id0);
  public boolean SetBaseURI(vtkURI id0)
  {
    return SetBaseURI_5(id0);
  }

  private native long GetBaseURI_6();
  public vtkURI GetBaseURI()
  {
    long temp = GetBaseURI_6();

    if (temp == 0) return null;
    return (vtkURI)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native boolean HasBaseURI_7();
  public boolean HasBaseURI()
  {
    return HasBaseURI_7();
  }

  private native boolean SetBaseFileName_8(byte[] id0, int len0);
  public boolean SetBaseFileName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetBaseFileName_8(bytes0, bytes0.length);
  }

  private native boolean SetBaseDirectory_9(byte[] id0, int len0);
  public boolean SetBaseDirectory(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    return SetBaseDirectory_9(bytes0, bytes0.length);
  }

  public vtkURILoader() { super(); }

  public vtkURILoader(long id) { super(id); }
  public native long   VTKInit();

}
