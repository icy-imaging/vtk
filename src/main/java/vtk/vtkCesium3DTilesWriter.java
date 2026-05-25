// java wrapper for vtkCesium3DTilesWriter object
//

package vtk;
import vtk.*;
import java.nio.charset.*;


public class vtkCesium3DTilesWriter extends vtkWriter
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

  private native void SetDirectoryName_4(byte[] id0, int len0);
  public void SetDirectoryName(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetDirectoryName_4(bytes0, bytes0.length);
  }

  private native byte[] GetDirectoryName_5();
  public String GetDirectoryName()
  {
    return new String(GetDirectoryName_5(), StandardCharsets.UTF_8);
  }

  private native void SetTextureBaseDirectory_6(byte[] id0, int len0);
  public void SetTextureBaseDirectory(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetTextureBaseDirectory_6(bytes0, bytes0.length);
  }

  private native byte[] GetTextureBaseDirectory_7();
  public String GetTextureBaseDirectory()
  {
    return new String(GetTextureBaseDirectory_7(), StandardCharsets.UTF_8);
  }

  private native void SetPropertyTextureFile_8(byte[] id0, int len0);
  public void SetPropertyTextureFile(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetPropertyTextureFile_8(bytes0, bytes0.length);
  }

  private native byte[] GetPropertyTextureFile_9();
  public String GetPropertyTextureFile()
  {
    return new String(GetPropertyTextureFile_9(), StandardCharsets.UTF_8);
  }

  private native void SetOffset_10(double id0,double id1,double id2);
  public void SetOffset(double id0,double id1,double id2)
  {
    SetOffset_10(id0,id1,id2);
  }

  private native void SetOffset_11(double id0[]);
  public void SetOffset(double id0[])
  {
    SetOffset_11(id0);
  }

  private native double[] GetOffset_12();
  public double[] GetOffset()
  {
    return GetOffset_12();
  }

  private native void SetSaveTextures_13(boolean id0);
  public void SetSaveTextures(boolean id0)
  {
    SetSaveTextures_13(id0);
  }

  private native boolean GetSaveTextures_14();
  public boolean GetSaveTextures()
  {
    return GetSaveTextures_14();
  }

  private native void SaveTexturesOn_15();
  public void SaveTexturesOn()
  {
    SaveTexturesOn_15();
  }

  private native void SaveTexturesOff_16();
  public void SaveTexturesOff()
  {
    SaveTexturesOff_16();
  }

  private native void SetSaveTiles_17(boolean id0);
  public void SetSaveTiles(boolean id0)
  {
    SetSaveTiles_17(id0);
  }

  private native boolean GetSaveTiles_18();
  public boolean GetSaveTiles()
  {
    return GetSaveTiles_18();
  }

  private native void SaveTilesOn_19();
  public void SaveTilesOn()
  {
    SaveTilesOn_19();
  }

  private native void SaveTilesOff_20();
  public void SaveTilesOff()
  {
    SaveTilesOff_20();
  }

  private native void SetMergeTilePolyData_21(boolean id0);
  public void SetMergeTilePolyData(boolean id0)
  {
    SetMergeTilePolyData_21(id0);
  }

  private native boolean GetMergeTilePolyData_22();
  public boolean GetMergeTilePolyData()
  {
    return GetMergeTilePolyData_22();
  }

  private native void MergeTilePolyDataOn_23();
  public void MergeTilePolyDataOn()
  {
    MergeTilePolyDataOn_23();
  }

  private native void MergeTilePolyDataOff_24();
  public void MergeTilePolyDataOff()
  {
    MergeTilePolyDataOff_24();
  }

  private native void SetMergedTextureWidth_25(int id0);
  public void SetMergedTextureWidth(int id0)
  {
    SetMergedTextureWidth_25(id0);
  }

  private native int GetMergedTextureWidth_26();
  public int GetMergedTextureWidth()
  {
    return GetMergedTextureWidth_26();
  }

  private native void SetContentGLTF_27(boolean id0);
  public void SetContentGLTF(boolean id0)
  {
    SetContentGLTF_27(id0);
  }

  private native boolean GetContentGLTF_28();
  public boolean GetContentGLTF()
  {
    return GetContentGLTF_28();
  }

  private native void ContentGLTFOn_29();
  public void ContentGLTFOn()
  {
    ContentGLTFOn_29();
  }

  private native void ContentGLTFOff_30();
  public void ContentGLTFOff()
  {
    ContentGLTFOff_30();
  }

  private native void SetContentGLTFSaveGLB_31(boolean id0);
  public void SetContentGLTFSaveGLB(boolean id0)
  {
    SetContentGLTFSaveGLB_31(id0);
  }

  private native boolean GetContentGLTFSaveGLB_32();
  public boolean GetContentGLTFSaveGLB()
  {
    return GetContentGLTFSaveGLB_32();
  }

  private native void ContentGLTFSaveGLBOn_33();
  public void ContentGLTFSaveGLBOn()
  {
    ContentGLTFSaveGLBOn_33();
  }

  private native void ContentGLTFSaveGLBOff_34();
  public void ContentGLTFSaveGLBOff()
  {
    ContentGLTFSaveGLBOff_34();
  }

  private native void SetInputType_35(int id0);
  public void SetInputType(int id0)
  {
    SetInputType_35(id0);
  }

  private native int GetInputType_36();
  public int GetInputType()
  {
    return GetInputType_36();
  }

  private native void SetNumberOfFeaturesPerTile_37(int id0);
  public void SetNumberOfFeaturesPerTile(int id0)
  {
    SetNumberOfFeaturesPerTile_37(id0);
  }

  private native int GetNumberOfFeaturesPerTile_38();
  public int GetNumberOfFeaturesPerTile()
  {
    return GetNumberOfFeaturesPerTile_38();
  }

  private native void SetCRS_39(byte[] id0, int len0);
  public void SetCRS(String id0)
  {
    byte[] bytes0 = id0.getBytes(StandardCharsets.UTF_8);
    SetCRS_39(bytes0, bytes0.length);
  }

  private native byte[] GetCRS_40();
  public String GetCRS()
  {
    return new String(GetCRS_40(), StandardCharsets.UTF_8);
  }

  public vtkCesium3DTilesWriter() { super(); }

  public vtkCesium3DTilesWriter(long id) { super(id); }
  public native long   VTKInit();

}
