// java wrapper for vtkDataTransferHelper object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkDataTransferHelper extends vtkObject
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

  private native void SetContext_4(vtkRenderWindow id0);
  public void SetContext(vtkRenderWindow id0)
  {
    SetContext_4(id0);
  }

  private native long GetContext_5();
  public vtkRenderWindow GetContext()
  {
    long temp = GetContext_5();

    if (temp == 0) return null;
    return (vtkRenderWindow)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetCPUExtent_6(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetCPUExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetCPUExtent_6(id0,id1,id2,id3,id4,id5);
  }

  private native void SetCPUExtent_7(int id0[]);
  public void SetCPUExtent(int id0[])
  {
    SetCPUExtent_7(id0);
  }

  private native int[] GetCPUExtent_8();
  public int[] GetCPUExtent()
  {
    return GetCPUExtent_8();
  }

  private native void SetGPUExtent_9(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetGPUExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetGPUExtent_9(id0,id1,id2,id3,id4,id5);
  }

  private native void SetGPUExtent_10(int id0[]);
  public void SetGPUExtent(int id0[])
  {
    SetGPUExtent_10(id0);
  }

  private native int[] GetGPUExtent_11();
  public int[] GetGPUExtent()
  {
    return GetGPUExtent_11();
  }

  private native void SetTextureExtent_12(int id0,int id1,int id2,int id3,int id4,int id5);
  public void SetTextureExtent(int id0,int id1,int id2,int id3,int id4,int id5)
  {
    SetTextureExtent_12(id0,id1,id2,id3,id4,id5);
  }

  private native void SetTextureExtent_13(int id0[]);
  public void SetTextureExtent(int id0[])
  {
    SetTextureExtent_13(id0);
  }

  private native int[] GetTextureExtent_14();
  public int[] GetTextureExtent()
  {
    return GetTextureExtent_14();
  }

  private native boolean GetCPUExtentIsValid_15();
  public boolean GetCPUExtentIsValid()
  {
    return GetCPUExtentIsValid_15();
  }

  private native boolean GetGPUExtentIsValid_16();
  public boolean GetGPUExtentIsValid()
  {
    return GetGPUExtentIsValid_16();
  }

  private native boolean GetTextureExtentIsValid_17();
  public boolean GetTextureExtentIsValid()
  {
    return GetTextureExtentIsValid_17();
  }

  private native void SetMinTextureDimension_18(int id0);
  public void SetMinTextureDimension(int id0)
  {
    SetMinTextureDimension_18(id0);
  }

  private native int GetMinTextureDimension_19();
  public int GetMinTextureDimension()
  {
    return GetMinTextureDimension_19();
  }

  private native long GetArray_20();
  public vtkDataArray GetArray()
  {
    long temp = GetArray_20();

    if (temp == 0) return null;
    return (vtkDataArray)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetArray_21(vtkDataArray id0);
  public void SetArray(vtkDataArray id0)
  {
    SetArray_21(id0);
  }

  private native long GetTexture_22();
  public vtkTextureObject GetTexture()
  {
    long temp = GetTexture_22();

    if (temp == 0) return null;
    return (vtkTextureObject)vtkObjectBase.JAVA_OBJECT_MANAGER.getJavaObject(temp);
  }

  private native void SetTexture_23(vtkTextureObject id0);
  public void SetTexture(vtkTextureObject id0)
  {
    SetTexture_23(id0);
  }

  private native boolean Download_24();
  public boolean Download()
  {
    return Download_24();
  }

  private native boolean DownloadAsync1_25();
  public boolean DownloadAsync1()
  {
    return DownloadAsync1_25();
  }

  private native boolean DownloadAsync2_26();
  public boolean DownloadAsync2()
  {
    return DownloadAsync2_26();
  }

  private native boolean GetShaderSupportsTextureInt_27();
  public boolean GetShaderSupportsTextureInt()
  {
    return GetShaderSupportsTextureInt_27();
  }

  private native void SetShaderSupportsTextureInt_28(boolean id0);
  public void SetShaderSupportsTextureInt(boolean id0)
  {
    SetShaderSupportsTextureInt_28(id0);
  }

  private native boolean IsSupported_29(vtkRenderWindow id0);
  public boolean IsSupported(vtkRenderWindow id0)
  {
    return IsSupported_29(id0);
  }

  public vtkDataTransferHelper() { super(); }

  public vtkDataTransferHelper(long id) { super(id); }
  public native long   VTKInit();

}
