// java wrapper for vtkImplicitTextureCoords object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkImplicitTextureCoords extends vtkDataSetAlgorithm
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

  private native void SetRFunction_4(vtkImplicitFunction id0);
  public void SetRFunction(vtkImplicitFunction id0)
  {
    SetRFunction_4(id0);
  }

  private native long GetRFunction_5();
  public vtkImplicitFunction GetRFunction()
  {
    long temp = GetRFunction_5();

    if (temp == 0) return null;
    return (vtkImplicitFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetSFunction_6(vtkImplicitFunction id0);
  public void SetSFunction(vtkImplicitFunction id0)
  {
    SetSFunction_6(id0);
  }

  private native long GetSFunction_7();
  public vtkImplicitFunction GetSFunction()
  {
    long temp = GetSFunction_7();

    if (temp == 0) return null;
    return (vtkImplicitFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTFunction_8(vtkImplicitFunction id0);
  public void SetTFunction(vtkImplicitFunction id0)
  {
    SetTFunction_8(id0);
  }

  private native long GetTFunction_9();
  public vtkImplicitFunction GetTFunction()
  {
    long temp = GetTFunction_9();

    if (temp == 0) return null;
    return (vtkImplicitFunction)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetFlipTexture_10(int id0);
  public void SetFlipTexture(int id0)
  {
    SetFlipTexture_10(id0);
  }

  private native int GetFlipTexture_11();
  public int GetFlipTexture()
  {
    return GetFlipTexture_11();
  }

  private native void FlipTextureOn_12();
  public void FlipTextureOn()
  {
    FlipTextureOn_12();
  }

  private native void FlipTextureOff_13();
  public void FlipTextureOff()
  {
    FlipTextureOff_13();
  }

  public vtkImplicitTextureCoords() { super(); }

  public vtkImplicitTextureCoords(long id) { super(id); }
  public native long   VTKInit();

}
