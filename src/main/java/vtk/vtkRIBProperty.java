// java wrapper for vtkRIBProperty object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkRIBProperty extends vtkProperty
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

  private native void SetSurfaceShaderUsesDefaultParameters_4(boolean id0);
  public void SetSurfaceShaderUsesDefaultParameters(boolean id0)
  {
    SetSurfaceShaderUsesDefaultParameters_4(id0);
  }

  private native boolean GetSurfaceShaderUsesDefaultParameters_5();
  public boolean GetSurfaceShaderUsesDefaultParameters()
  {
    return GetSurfaceShaderUsesDefaultParameters_5();
  }

  private native void SurfaceShaderUsesDefaultParametersOn_6();
  public void SurfaceShaderUsesDefaultParametersOn()
  {
    SurfaceShaderUsesDefaultParametersOn_6();
  }

  private native void SurfaceShaderUsesDefaultParametersOff_7();
  public void SurfaceShaderUsesDefaultParametersOff()
  {
    SurfaceShaderUsesDefaultParametersOff_7();
  }

  private native void SetSurfaceShader_8(byte[] id0, int len0);
  public void SetSurfaceShader(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetSurfaceShader_8(bytes0, bytes0.length);
  }

  private native byte[] GetSurfaceShader_9();
  public String GetSurfaceShader()
  {
    return new String(GetSurfaceShader_9(), StandardCharsets.UTF_8);
  }

  private native void SetDisplacementShader_10(byte[] id0, int len0);
  public void SetDisplacementShader(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDisplacementShader_10(bytes0, bytes0.length);
  }

  private native byte[] GetDisplacementShader_11();
  public String GetDisplacementShader()
  {
    return new String(GetDisplacementShader_11(), StandardCharsets.UTF_8);
  }

  private native void SetVariable_12(byte[] id0, int len0,byte[] id1, int len1);
  public void SetVariable(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetVariable_12(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void AddVariable_13(byte[] id0, int len0,byte[] id1, int len1);
  public void AddVariable(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddVariable_13(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native byte[] GetDeclarations_14();
  public String GetDeclarations()
  {
    return new String(GetDeclarations_14(), StandardCharsets.UTF_8);
  }

  private native void SetParameter_15(byte[] id0, int len0,byte[] id1, int len1);
  public void SetParameter(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetParameter_15(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void AddParameter_16(byte[] id0, int len0,byte[] id1, int len1);
  public void AddParameter(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddParameter_16(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void SetSurfaceShaderParameter_17(byte[] id0, int len0,byte[] id1, int len1);
  public void SetSurfaceShaderParameter(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetSurfaceShaderParameter_17(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void AddSurfaceShaderParameter_18(byte[] id0, int len0,byte[] id1, int len1);
  public void AddSurfaceShaderParameter(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddSurfaceShaderParameter_18(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void SetDisplacementShaderParameter_19(byte[] id0, int len0,byte[] id1, int len1);
  public void SetDisplacementShaderParameter(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    SetDisplacementShaderParameter_19(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native void AddDisplacementShaderParameter_20(byte[] id0, int len0,byte[] id1, int len1);
  public void AddDisplacementShaderParameter(String id0,String id1)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    byte[] bytes1 = id1.getBytes(StandardCharsets.UTF_8);
    AddDisplacementShaderParameter_20(bytes0, bytes0.length,bytes1, bytes1.length);
  }

  private native byte[] GetParameters_21();
  public String GetParameters()
  {
    return new String(GetParameters_21(), StandardCharsets.UTF_8);
  }

  private native byte[] GetSurfaceShaderParameters_22();
  public String GetSurfaceShaderParameters()
  {
    return new String(GetSurfaceShaderParameters_22(), StandardCharsets.UTF_8);
  }

  private native byte[] GetDisplacementShaderParameters_23();
  public String GetDisplacementShaderParameters()
  {
    return new String(GetDisplacementShaderParameters_23(), StandardCharsets.UTF_8);
  }

  public vtkRIBProperty() { super(); }

  public vtkRIBProperty(long id) { super(id); }
  public native long   VTKInit();

}
