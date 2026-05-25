// java wrapper for vtkTextCodecFactory object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkTextCodecFactory extends vtkObject
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

  private native void UnRegisterAllCreateCallbacks_4();
  public void UnRegisterAllCreateCallbacks()
  {
    UnRegisterAllCreateCallbacks_4();
  }

  private native long CodecForName_5(byte[] id0, int len0);
  public vtkTextCodec CodecForName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    long temp = CodecForName_5(bytes0, bytes0.length);

    if (temp == 0) return null;
    return (vtkTextCodec)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void Initialize_6();
  public void Initialize()
  {
    Initialize_6();
  }

  public vtkTextCodecFactory() { super(); }

  public vtkTextCodecFactory(long id) { super(id); }
  public native long   VTKInit();

}
