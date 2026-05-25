// java wrapper for vtkImageReader2Factory object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImageReader2Factory extends vtkObject
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

  private native void RegisterReader_4(vtkImageReader2 id0);
  public void RegisterReader(vtkImageReader2 id0)
  {
    RegisterReader_4(id0);
  }

  private native long CreateImageReader2_5(byte[] id0, int len0);
  public vtkImageReader2 CreateImageReader2(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = CreateImageReader2_5(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkImageReader2)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native long CreateImageReader2FromExtension_6(byte[] id0, int len0);
  public vtkImageReader2 CreateImageReader2FromExtension(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = CreateImageReader2FromExtension_6(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkImageReader2)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void GetRegisteredReaders_7(vtkImageReader2Collection id0);
  public void GetRegisteredReaders(vtkImageReader2Collection id0)
  {
    GetRegisteredReaders_7(id0);
  }

  private native boolean CheckExtensionIsInExtensions_8(byte[] id0, int len0,byte[] id1, int len1);
  public boolean CheckExtensionIsInExtensions(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    return CheckExtensionIsInExtensions_8(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  public vtkImageReader2Factory() { super(); }

  public vtkImageReader2Factory(long id) { super(id); }
  public native long   VTKInit();

}
